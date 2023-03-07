public class SpecialEleven {
    public static void main(String[] args) {
        System.out.print(specialEleven(24));
    }
    public static boolean specialEleven(int n) {
        return ((n % 11 == 0)  || (n % 11 == 1));

        /* if ((n % 11 == 0)  || (n % 11 == 1)) {
            return true;
        }
        return false; */ // Funciona también
    }
}