/*
Return the sum of the numbers in the array, returning 0 for an empty array. 
Except the number 13 is very unlucky, so it does not count and numbers 
that come immediately after a 13 also do not count.
  */

public int sum13(int[] nums) {
        int sum = 0;
        boolean skipNext = false;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                skipNext = true;
            } else if (!skipNext) {
                sum += nums[i];
            } else {
                skipNext = false;
            }
        }
        
        return sum;
}

//Exercise from CodingBat
