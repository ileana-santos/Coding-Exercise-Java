public class Less20 {
    public static void main(String[] args) {
        System.out.println(less20(40));
    }
    public static boolean less20(int n) {

        return((Math.abs((n + 1) % 20) == 0) || (Math.abs((n + 2) % 20) ==0));
    }
}
