public class More20 {
    public static void main(String[] args) {
        System.out.print(more20(22));
    }
    public static boolean more20(int n) {

        /* if ((Math.abs(n % 20) == 1) || (Math.abs(n % 20) == 2)) {
            return true;
        }
        return false; */ //Funciona también

        return ((Math.abs(n % 20) == 1) || (Math.abs(n % 20) == 2));
    }
}
