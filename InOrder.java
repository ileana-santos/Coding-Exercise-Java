public class InOrder {
    public static void main(String[] args) {
        System.out.println(inOrder(2,4,6,true));
    }
    public static boolean inOrder(int a, int b, int c, boolean bOk) {

        if ((b > a && c > b && !bOk) || (b <= a && c > b && bOk) || (b >= a && c > b && bOk)) {
            return true;
        }
        return false;

        //return (b > a && c > b && !bOk) || (b <= a && c > b && bOk) || (b >= a && c > b && bOk); Simplificado
    }
    }
