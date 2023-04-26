import java.util.Scanner;

public class TimesLetter {
    public static void main(String[] args) {
        //Determine and print the number of times a letter appears in the input entered by the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String input = sc.nextLine();

        System.out.println("Enter a letter: ");
        char search = sc.next().charAt(0);

        int count = 0;

        for(int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == search)
                count++;
        }

        System.out.println("The word " + input + " has " + count + " " + search +"'s");
    }
}