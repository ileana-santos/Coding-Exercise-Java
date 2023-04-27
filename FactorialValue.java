import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {

        // Write a java program to calculate the factorial value of given number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an positive number: ");
        int n1 = sc.nextInt();

        //Using for loop
        int value = 1;

       for (int i = n1; i > 0 ; i--){
            value *= i;
        }
        System.out.println("The Factorial value of "+ n1 + " is " + value);

       //Using while loop
        int wert = 1;
        int x = 1;
        while (x <= n1) {
            wert *= x;
            x++;
        }
        System.out.println("The Factorial value of "+ n1 + " is " + wert);

        //Using do while loop
        int valor = 1;
        int y = 1;
        do {
            valor *= y;
            y++;
        } while (y <= n1);
        System.out.println("The Factorial value of "+ n1 + " is " + valor);
    }
}
