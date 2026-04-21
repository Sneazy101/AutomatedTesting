import soot.Body;
import soot.BodyTransformer;
import soot.toolkits.graph.BriefUnitGraph;
import soot.toolkits.graph.UnitGraph;
import java.util.Map;

public class CoverageTransformer extends BodyTransformer {

    @Override
    protected void internalTransform(Body body, String phaseName, Map<String, String> options) {
        System.out.println("Applying CoverageTransformer to method: " + body.getMethod().getSignature());

        // Create a Control Flow Graph (CFG) for the method body.
        // BriefUnitGraph handles basic CFG without exceptional edges.
        // You can use ExceptionalUnitGraph if you need to track exception flows.
        UnitGraph graph = new BriefUnitGraph(body);

        // Run your custom ForwardBranchedFlowAnalysis on the graph
        CoverageAnalysis analysis = new CoverageAnalysis(graph);

        // After the analysis is done, we can just ask the reporter to print the accumulated test cases.
        // TestValues is now persistent and doesn't need to be extracted from flow sets.
        TestValues reporter = analysis.getReporter();
        if (reporter != null) {
            reporter.printTestValues();
        }
    }
}