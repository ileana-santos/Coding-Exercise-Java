    /*  =====================
        Sum 3 and 5 Challenge
        =====================
        *Create a for loop using a range of numbers from 1 to 1000 inclusive.
        *Sum all the numbers that can be divided by both 3 and 5
        *Print out the numbers that have met the above conditions
        *break out of the loop once you have found 5 numbers that met the conditions.
        *After breaking out of the loop, print the sum of the numbers that met the conditions.
        *Note: type all code in the main method */

public class Sum3and5 {
    
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;

        for (int num = 1; num <= 1000; num++) {

            if ((num % 3 == 0) && (num % 5 == 0)) {
                counter++;
                sum += num;
                System.out.println("Found a mactch " + num);
            }
            if (counter == 5) {
                System.out.println("Sum = " + sum);
                break;
            }
            //This is a Challenge that I did  for my Java course.
        }
    }
}