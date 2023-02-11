public class InOrderEqual {
    public static void main(String[] args) {
        System.out.println(inOrderEqual(5, 5,7, true));
    }
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {

        return ((!equalOk && a < b && b < c) || (equalOk && a <= b && b <= c));
    }
}
