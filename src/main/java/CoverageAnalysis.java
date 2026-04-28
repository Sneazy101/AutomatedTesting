import soot.Local;
import soot.RefType;
import soot.Unit;
import soot.Value;
import soot.jimple.IfStmt;
import soot.toolkits.graph.UnitGraph;
import soot.toolkits.scalar.ForwardBranchedFlowAnalysis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CoverageAnalysis extends ForwardBranchedFlowAnalysis<Tracer> {

    final UnitGraph graph;
    public TestValues reporter;

    public CoverageAnalysis(UnitGraph graph) {
        super(graph);
        this.graph = graph;
        
        // Initialize the persistent reporter
        Map<Value, ArrayList<Object>> map = new java.util.HashMap<>();
        Map<Value, soot.Type> dataTypes = new java.util.HashMap<>();
        List<Value> functionInputs = new ArrayList<>();

        for (Local l : graph.getBody().getLocals()) {
            map.put(l, new ArrayList<>());
            dataTypes.put(l, l.getType());
            if(l.getType() == soot.BooleanType.v()){
                ArrayList<Object> boolValues = map.get(l);
                boolValues.add(true);
                boolValues.add(false);
            } else if (l.getType() == soot.IntType.v()) {
                ArrayList<Object> intValues = map.get(l);
                intValues.add(0);
                intValues.add(1);
                intValues.add(-1);
            } else if (l.getType() == soot.FloatType.v()) {
                ArrayList<Object> floatValues = map.get(l);
                floatValues.add(0.0f);
                floatValues.add(1.0f);
                floatValues.add(-1.0f);
            } else if (l.getType().toString().equals("java.lang.String")) {
                ArrayList<Object> stringValues = map.get(l);
                stringValues.add("");
                stringValues.add(" ");
            }
        }

        functionInputs.addAll(graph.getBody().getParameterLocals());

        this.reporter = new TestValues(map, dataTypes, functionInputs);

        doAnalysis();
    }

    public TestValues getReporter() {
        return reporter;
    }

    @Override
    protected Tracer newInitialFlow() {
        return new Tracer();
    }

    @Override
    protected void merge(Tracer dest, Tracer a1, Tracer a2) {
        dest.copy(a1);
        dest.merge(a2);
    }

    @Override
    protected void copy(Tracer source, Tracer dest) {
        dest.copy(source);
    }

    private void HandleCondition(Value condition, Tracer tracer) {
        if (condition instanceof soot.jimple.BinopExpr) {
            soot.jimple.BinopExpr binopExpr = (soot.jimple.BinopExpr) condition;
            Value leftOp = binopExpr.getOp1();
            Value rightOp = binopExpr.getOp2();
            String expr = binopExpr.toString();

            // Extract the operator string
            String operator = "";
            if (expr.contains("==")) operator = "==";
            else if (expr.contains("!=")) operator = "!=";
            else if (expr.contains(">=")) operator = ">=";
            else if (expr.contains("<=")) operator = "<=";
            else if (expr.contains(">")) operator = ">";
            else if (expr.contains("<")) operator = "<";
            else operator = "?";

            // Add the equation to our Tracer's Expression Tree using resolved symbolic values
            Tracer.ExprNode leftNode = tracer.resolveValue(leftOp);
            Tracer.ExprNode rightNode = tracer.resolveValue(rightOp);
            Tracer.ExprNode eqNode = new Tracer.BinaryOpNode(operator, leftNode, rightNode);
            tracer.addEquation(eqNode);

            // Report the test values persistently using leftOp's type and Symbolic Tracing
            Tracer.ExprNode leftExpr = tracer.resolveValue(leftOp);
            
            if (leftOp.getType() == soot.IntType.v() || leftOp.getType() == soot.FloatType.v() || leftOp.getType() == soot.ShortType.v() || leftOp.getType() == soot.ByteType.v()) {
                Double rightConst = evaluateConstant(rightNode);
                if (rightConst != null) {
                    double val = rightConst;
                    solveWithOperator(leftExpr, val, operator);
                } else {
                    Tracer.ExprNode diffExpr = new Tracer.BinaryOpNode("-", leftExpr, rightNode);
                    solveWithOperator(diffExpr, 0, operator);
                }
            } else if (leftOp.getType().toString().equals("java.lang.String")) {
                if (expr.contains("==") || expr.contains("!=")) {
                    reporter.addNewTestCase(leftOp, parseValue(leftOp.getType(), rightOp.toString()));
                }
            }
        }
    }

    private void solveWithOperator(Tracer.ExprNode expr, double val, String operator) {
        if (operator.equals("==")) {
            solveForInput(expr, val);
            solveForInput(expr, val + 1);
        } else if (operator.equals("!=")) {
            solveForInput(expr, val + 1);
            solveForInput(expr, val);
        } else if (operator.equals(">")) {
            solveForInput(expr, val + 1);
            solveForInput(expr, val);
        } else if (operator.equals("<")) {
            solveForInput(expr, val - 1);
            solveForInput(expr, val);
        } else if (operator.equals(">=")) {
            solveForInput(expr, val);
            solveForInput(expr, val - 1);
        } else if (operator.equals("<=")) {
            solveForInput(expr, val);
            solveForInput(expr, val + 1);
        }
    }

    private Object parseValue(soot.Type type, String valStr) {
        try {
            if (type == soot.IntType.v()) {
                return Integer.parseInt(valStr);
            } else if (type == soot.BooleanType.v()) {
                return valStr.equals("1") || valStr.equalsIgnoreCase("true");
            } else if (type == soot.ByteType.v()) {
                return Byte.parseByte(valStr);
            } else if (type == soot.ShortType.v()) {
                return Short.parseShort(valStr);
            } else if (type == soot.LongType.v()) {
                return Long.parseLong(valStr.replaceAll("[l|L]$", ""));
            } else if (type == soot.FloatType.v()) {
                return Float.parseFloat(valStr.replaceAll("[f|F]$", ""));
            } else if (type == soot.DoubleType.v()) {
                return Double.parseDouble(valStr.replaceAll("[d|D]$", ""));
            } else if (type.toString().equals("java.lang.String")) {
                if (valStr.startsWith("\"") && valStr.endsWith("\"")) {
                    return valStr.substring(1, valStr.length() - 1);
                }
                return valStr;
            }
        } catch (Exception e) {
            // Ignore exception and return string fallback
        }
        return valStr;
    }

    private Double evaluateConstant(Tracer.ExprNode expr) {
        if (expr instanceof Tracer.ConstNode) {
            String valStr = ((Tracer.ConstNode) expr).getValue().replaceAll("[fFlLdD]$", "");
            try {
                return Double.parseDouble(valStr);
            } catch (NumberFormatException e) {
                return null;
            }
        } else if (expr instanceof Tracer.BinaryOpNode) {
            Tracer.BinaryOpNode binop = (Tracer.BinaryOpNode) expr;
            Double leftVal = evaluateConstant(binop.getLeft());
            Double rightVal = evaluateConstant(binop.getRight());
            if (leftVal == null || rightVal == null) return null;
            
            switch (binop.getOperator()) {
                case "+": return leftVal + rightVal;
                case "-": return leftVal - rightVal;
                case "*": return leftVal * rightVal;
                case "/": return rightVal != 0 ? leftVal / rightVal : null;
                default: return null;
            }
        } else if (expr instanceof Tracer.UnaryOpNode) {
            Tracer.UnaryOpNode unop = (Tracer.UnaryOpNode) expr;
            Double val = evaluateConstant(unop.getOperand());
            if (val == null) return null;
            if (unop.getOperator().equals("-")) return -val;
            return null;
        }
        return null;
    }

    private void solveForInput(Tracer.ExprNode expr, double targetValue) {
        if (expr instanceof Tracer.VarNode) {
            Tracer.VarNode varNode = (Tracer.VarNode) expr;
            Value sootValue = varNode.getSootValue();
            if (sootValue != null) {
                Object finalVal = targetValue;
                if (sootValue.getType() == soot.IntType.v() || sootValue.getType() == soot.ShortType.v() || sootValue.getType() == soot.ByteType.v()) {
                    finalVal = (int) targetValue;
                } else if (sootValue.getType() == soot.FloatType.v()) {
                    finalVal = (float) targetValue;
                } else if (sootValue.getType() == soot.LongType.v()) {
                    finalVal = (long) targetValue;
                }
                reporter.addNewTestCase(sootValue, finalVal);
            }
        } else if (expr instanceof Tracer.BinaryOpNode) {
            Tracer.BinaryOpNode binop = (Tracer.BinaryOpNode) expr;
            Double leftConst = evaluateConstant(binop.getLeft());
            Double rightConst = evaluateConstant(binop.getRight());
            
            String op = binop.getOperator();
            
            if (leftConst != null && rightConst == null) {
                solveWithConstant(binop.getRight(), targetValue, leftConst, op, false);
            } else if (leftConst == null && rightConst != null) {
                solveWithConstant(binop.getLeft(), targetValue, rightConst, op, true);
            } else if (leftConst == null && rightConst == null) {
                List<Double> leftPossibleValues = evaluateAllPossibleValues(binop.getLeft());
                for (Double lVal : leftPossibleValues) {
                    solveWithConstant(binop.getRight(), targetValue, lVal, op, false);
                }

                List<Double> rightPossibleValues = evaluateAllPossibleValues(binop.getRight());
                for (Double rVal : rightPossibleValues) {
                    solveWithConstant(binop.getLeft(), targetValue, rVal, op, true);
                }
            }
        }
    }

    private void solveWithConstant(Tracer.ExprNode exprToSolve, double targetValue, double constVal, String op, boolean isLeftSymbolic) {
        if (!isLeftSymbolic) { // left is constant, right is symbolic
            if (op.equals("+")) {
                solveForInput(exprToSolve, targetValue - constVal);
            } else if (op.equals("-")) {
                solveForInput(exprToSolve, constVal - targetValue);
            } else if (op.equals("*")) {
                if (constVal != 0) solveForInput(exprToSolve, targetValue / constVal);
            } else if (op.equals("/")) {
                if (targetValue != 0) solveForInput(exprToSolve, constVal / targetValue);
            }
        } else { // left is symbolic, right is constant
            if (op.equals("+")) {
                solveForInput(exprToSolve, targetValue - constVal);
            } else if (op.equals("-")) {
                solveForInput(exprToSolve, targetValue + constVal);
            } else if (op.equals("*")) {
                if (constVal != 0) solveForInput(exprToSolve, targetValue / constVal);
            } else if (op.equals("/")) {
                solveForInput(exprToSolve, targetValue * constVal);
            }
        }
    }

    private List<Double> evaluateAllPossibleValues(Tracer.ExprNode expr) {
        List<Double> results = new ArrayList<>();
        if (expr instanceof Tracer.ConstNode) {
            Double val = evaluateConstant(expr);
            if (val != null) results.add(val);
        } else if (expr instanceof Tracer.VarNode) {
            Tracer.VarNode varNode = (Tracer.VarNode) expr;
            Value v = varNode.getSootValue();
            if (v != null) {
                List<Object> states = reporter.getValueStates(v);
                if (states != null) {
                    for (Object state : states) {
                        if (state instanceof Number) {
                            results.add(((Number) state).doubleValue());
                        } else if (state instanceof Boolean) {
                            results.add((Boolean) state ? 1.0 : 0.0);
                        }
                    }
                }
            }
        } else if (expr instanceof Tracer.BinaryOpNode) {
            Tracer.BinaryOpNode binop = (Tracer.BinaryOpNode) expr;
            List<Double> leftVals = evaluateAllPossibleValues(binop.getLeft());
            List<Double> rightVals = evaluateAllPossibleValues(binop.getRight());
            for (Double l : leftVals) {
                for (Double r : rightVals) {
                    switch (binop.getOperator()) {
                        case "+": results.add(l + r); break;
                        case "-": results.add(l - r); break;
                        case "*": results.add(l * r); break;
                        case "/": if (r != 0) results.add(l / r); break;
                    }
                }
            }
        } else if (expr instanceof Tracer.UnaryOpNode) {
            Tracer.UnaryOpNode unop = (Tracer.UnaryOpNode) expr;
            List<Double> vals = evaluateAllPossibleValues(unop.getOperand());
            for (Double v : vals) {
                if (unop.getOperator().equals("-")) {
                    results.add(-v);
                }
            }
        }
        return new ArrayList<>(new java.util.HashSet<>(results));
    }

    private void HandleSwitch(soot.jimple.SwitchStmt switchStmt, Tracer tracer) {
        if (switchStmt instanceof soot.jimple.LookupSwitchStmt) {
            soot.jimple.LookupSwitchStmt lookupStmt = (soot.jimple.LookupSwitchStmt) switchStmt;
            Value key = lookupStmt.getKey();
            Tracer.ExprNode keyExpr = tracer.resolveValue(key);
            
            int maxVal = Integer.MIN_VALUE;
            boolean hasValues = false;
            for (Object valObj : lookupStmt.getLookupValues()) {
                int v = 0;
                if (valObj instanceof soot.jimple.IntConstant) {
                    v = ((soot.jimple.IntConstant) valObj).value;
                } else if (valObj instanceof Integer) {
                    v = (Integer) valObj;
                }
                solveForInput(keyExpr, v);
                if (v > maxVal) maxVal = v;
                hasValues = true;
            }
            if (hasValues) {
                solveForInput(keyExpr, maxVal + 1); // default case
            } else {
                solveForInput(keyExpr, 0); // default case
            }
        } else if (switchStmt instanceof soot.jimple.TableSwitchStmt) {
            soot.jimple.TableSwitchStmt tableStmt = (soot.jimple.TableSwitchStmt) switchStmt;
            Value key = tableStmt.getKey();
            Tracer.ExprNode keyExpr = tracer.resolveValue(key);
            int low = tableStmt.getLowIndex();
            int high = tableStmt.getHighIndex();
            for (int i = low; i <= high; i++) {
                solveForInput(keyExpr, i);
            }
            solveForInput(keyExpr, high + 1); // default case
        }
    }

    @Override
    protected void flowThrough(Tracer in, Unit s, List<Tracer> fallOut, List<Tracer> branchOuts) {

        if (s instanceof IfStmt) {
            IfStmt ifStmt = (IfStmt) s;
            Value condition = ifStmt.getCondition();
            HandleCondition( condition, in);
        } else if (s instanceof soot.jimple.SwitchStmt) {
            HandleSwitch((soot.jimple.SwitchStmt) s, in);
        }

        // Track assignments to build symbolic state
        if (s instanceof soot.jimple.AssignStmt) {
            soot.jimple.AssignStmt assign = (soot.jimple.AssignStmt) s;
            Value leftOp = assign.getLeftOp();
            Value rightOp = assign.getRightOp();
            
            Tracer.ExprNode rightNode = null;
            
            if (rightOp instanceof soot.jimple.BinopExpr) {
                soot.jimple.BinopExpr binop = (soot.jimple.BinopExpr) rightOp;
                Tracer.ExprNode r1 = in.resolveValue(binop.getOp1());
                Tracer.ExprNode r2 = in.resolveValue(binop.getOp2());
                
                String exprStr = rightOp.toString();
                String operator = "?";
                if (exprStr.contains(" + ")) operator = "+";
                else if (exprStr.contains(" - ")) operator = "-";
                else if (exprStr.contains(" * ")) operator = "*";
                else if (exprStr.contains(" / ")) operator = "/";
                else if (exprStr.contains(" % ")) operator = "%";
                else if (exprStr.contains(" & ")) operator = "&";
                else if (exprStr.contains(" | ")) operator = "|";
                else if (exprStr.contains(" ^ ")) operator = "^";
                else if (exprStr.contains(" << ")) operator = "<<";
                else if (exprStr.contains(" >> ")) operator = ">>";
                else if (exprStr.contains(" >>> ")) operator = ">>>";
                
                rightNode = new Tracer.BinaryOpNode(operator, r1, r2);
            } else {
                rightNode = in.resolveValue(rightOp);
            }
            
            if (rightNode != null) {
                in.putSymbol(leftOp.toString(), rightNode);
            }
        }

        for (Tracer out : fallOut) {
            copy(in, out);
        }

        for (Tracer out : branchOuts) {
            copy(in, out);
        }
    }
}
