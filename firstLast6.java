public class firstLast6 {
    public static void main(String[] args) {

        //Arrays
        /*
        Given an array of ints, return true if 6 appears as either
        the first or last element in the array. The array will be
        length 1 or more.
         */

        System.out.println(FirstLast6(new int[] {1, 2, 6}));
        System.out.println(FirstLast6(new int[] {6, 1, 2, 3}));
        System.out.println(FirstLast6(new int[] {13, 6, 1, 2, 3}));
    }

    public static boolean FirstLast6 (int[] nums) {

        if (nums [0] == 6 || nums [nums.length - 1] == 6){
            return true;
        }
        return false;
    }

    // Solution notes: check the first and last elements, returning true
    // if they are == 6. we are given that the array is at least length 1,
    // so we don't need to check the length before using [].
    // A solution can be written very compactly with || as just
    // return(nums[0] == 6 || nums[nums.length - 1] == 6);
}
