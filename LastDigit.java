public class LastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(2,13,3));
    }
    public static boolean lastDigit(int a, int b, int c) {

        return ((a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10));
    }
}
