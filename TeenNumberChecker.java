public class TeenNumberChecker {
    public static void main(String[] args) {
        hasTeen(13, 19, 14);
        isTeen(15);
    }
    public static boolean hasTeen(int age1, int age2, int age3){

        if ((age1 >=13 && age1 <= 19) || (age2 >=13 && age2 <= 19) || (age3 >=13 && age3 <= 19)) {
            System.out.println("true");
            return true;
        }
        return false;
    }
    public static boolean isTeen(int teen) {

        if(teen >=13 && teen <= 19) {
            System.out.println("true");
            return true;
        }

        return false;
    }
}
