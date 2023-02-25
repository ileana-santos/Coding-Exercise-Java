public class Old35 {
    public static void main(String[] args) {
        System.out.print(old35(15));
    }
    public static boolean old35(int n) {

        if ((Math.abs(n % 3) == 0) && (Math.abs(n % 5) == 0)) {
            return false;
        } else return (Math.abs(n % 3) == 0) || (Math.abs(n % 5) == 0);
    }
}
