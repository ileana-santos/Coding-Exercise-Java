public class SumOfInteger02 {
    public static void main(String[] args) {

        // Write a program to find the sum of 5 integers.
        // Use for loop. Don't ask for user input.

        int [] numbers = {2, 4, 3 , -2, 3};
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        System.out.print("Sum of the 5 integer is: " + sum);
    }
}
