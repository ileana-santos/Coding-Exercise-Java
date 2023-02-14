public class LoVe6 {
    public static void main(String[] args) {

        System.out.println(love6(-7, 1));
    }

    public static boolean love6(int a, int b) {

        if (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6) {
            return true;
        }
        return false;

        // Simplified if else : return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
    }
}
