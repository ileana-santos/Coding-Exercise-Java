public class FizzString {
    public static void main(String[] args) {
        System.out.println(fizzString("dib"));
    }
    public static String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        }
        return str;
    }
}
