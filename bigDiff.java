/*Given an array length 1 or more of ints, return the difference between the largest
and smallest values in the array. Note: the built-in Math.min(v1, v2) and
Math.max(v1, v2) methods return the smaller or larger of two values.*/

public int bigDiff(int[] nums) {
    int min = nums[0];
    int max = nums[0];
  
    for(int i = 1; i < nums.length; i++) {
        min = Math.min(min, nums[i]);
        max = Math.max(max, nums[i]);
    }
   
    return max - min;
}

//Exercise from CodingBat
