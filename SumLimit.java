public class SumLimit {
    /* Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same
    number of digits as a. If the sum has more digits than a, just return a without b. (Note:
     one way to compute the number of digits of a non-negative int n is to convert it to a string
     with String.valueOf(n) and then check the length of the string.)
     */
    public static void main(String[] args) {
        System.out.println(sumLimit(8, 1));
    }
    public static int sumLimit(int a, int b) {
        //String sum = String.valueOf(a + b);
       // String aLength = String.valueOf(a);
       // return (sum.length() == aLength.length()) ? a + b : a;

        int sum = a + b;
        int aLength = String.valueOf(a).length();
        int sumLength = String.valueOf(sum).length();
        if (sumLength == aLength){
            return sum;
        }
        return a;
    }
}
