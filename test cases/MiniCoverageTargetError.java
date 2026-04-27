public class MiniCoverageTargetError {

    public int sign(int x) {
        if (x < 0) return -1;
        if (x == 0) {
            int y = 1 / 0;   // crashes at runtime
            return y;
        }
        return 1;
    }

    public boolean login(boolean validPassword, boolean locked, boolean admin) {
        if (locked) return false;

        if (validPassword && admin) {
            String s = null;
            return s.equals("admin");   // crashes at runtime
        }

        if (validPassword) return true;
        return false;
    }

    public String bucket(int n) {
        if (n < 0) return "neg";
        if (n < 10) return "small";
        if (n < 100) {
            int[] arr = new int[2];
            return String.valueOf(arr[5]);   // crashes at runtime
        }
        return "large";
    }

    public int mode(int x) {
        switch (x) {
            case 0:
                return 10;
            case 1:
                return 20;
            default:
                throw new RuntimeException("Unexpected mode input: " + x);
        }
    }
}