/*Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.*/

public boolean haveThree(int[] nums) {
       int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                if (i > 0 && nums[i - 1] == 3) {
                    return false; // Two 3's are consecutive
                }
                if (i < nums.length - 1 && nums[i + 1] == 3) {
                    return false; // Two 3's are consecutive
                }
            }
        }
        return count == 3;
}


//Exercise from CodingBat
