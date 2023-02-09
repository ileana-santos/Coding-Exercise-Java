public class In1To10 {
    public static void main(String[] args) {
        System.out.print(in1To10(11,true));
    }
    public static boolean in1To10(int n, boolean outsideMode) {

        /* if (!outsideMode) {
            if (n >= 1 && n <= 10) {
                return true;
            } else {
                return false;
            }
        } else {
            if (n <= 1 || n >= 10) {
                return true;
            } else {
                return false;
            }
        } */ // Funciona

        /* if ((!outsideMode) && (n >= 1 && n <= 10)) {
            return true;
        } else if ((outsideMode) && (n <= 1 || n >= 10)) {
            return true;
        }
        return false; */ // Funciona

        return (((!outsideMode) && (n >= 1 && n <= 10)) || ((outsideMode) && (n <= 1 || n >= 10)));

    }
}
