import java.util.Scanner;

public class User_Pass {
    public static void main(String[] args) {
        /*Suppose we have a database composed of two fields or columns (arrays),
        the first field is for the username (user[]) and the other one is for the password(pass[]).
        Then if one of them had successfully login, the output should be:
        Enter username: Hassan
        Enter password: homecomingking
        Hello Hassan!
        But if not, “Incorrect Login!” */

        String user[] = {"Hassan", "Idris", "Trevor"};
        String pass[] = {"homecomingking", "turnupcharlie", "afraidofthedark"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.nextLine();

        System.out.println("Enter password: ");
        String password = sc.nextLine();

        int userIndex = 0;
        //int passIndex = 0;
        for (int i = 0; i < user.length; i++){
            if (username.equalsIgnoreCase(user[i])){
                userIndex = i;
            }
        }

        if (userIndex >= 0 && pass[userIndex].equals(password)) {
            System.out.println("Hello " + user[userIndex] + "!");
            System.out.println("Te amo mucho!");
        } else {
            System.out.println("Incorrect Login!");
        }
    }
}
