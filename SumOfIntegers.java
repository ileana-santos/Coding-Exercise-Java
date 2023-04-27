import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n1 = sc.nextInt();

        System.out.println("Enter an integer: ");
        int n2 = sc.nextInt();

        System.out.println("Enter an integer: ");
        int n3 = sc.nextInt();

        System.out.println("Enter an integer:: ");
        int n4 = sc.nextInt();

        System.out.println("Enter an integer: ");
        int n5 = sc.nextInt();

        int sum = n1 + n2 + n3 + n4 + n5;

        System.out.print("Sum of the 5 integer is: " + sum);
    }
}
