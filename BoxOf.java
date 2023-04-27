import java.util.Scanner;

public class BoxOf {
    public static void main(String[] args) {
        //Write a program that will print a box of #’s taking from user the height and width values.

        Scanner sc = new Scanner(System.in);
        System.out.println("Height: ");
        int height = sc.nextInt();

        System.out.println("Width: ");
        int width = sc.nextInt();

        for(int i = 1; i <= height; i++) {

            for(int j = 1; j <= width; j++) {
                    System.out.print("#");
            }
            System.out.print("\n");
        }

    }
}
