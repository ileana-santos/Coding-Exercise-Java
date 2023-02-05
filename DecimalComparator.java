public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.0, 3.0);
    }
    public static boolean areEqualByThreeDecimalPlaces(double myFirstNumber, double mySecondNumber){

        if (((int)(myFirstNumber * 1000)) == ((int)(mySecondNumber * 1000))){
            //System.out.println(myFirstNumber + " = " + mySecondNumber);
            return true;
        }
        return false;
    }
}
