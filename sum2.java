/*Given an array of ints, return the sum of the first 2 elements in the array. 
  If the array length is less than 2, just sum up the elements that exist, 
  returning 0 if the array is length 0.*/

public int sum2(int[] nums) {
  // Check if the array length is less than 2
        if (nums.length < 2) {
            // If array length is 0, return 0; otherwise, return the sum of existing elements
            return nums.length == 0 ? 0 : nums[0];
        } else {
            // Return the sum of the first two elements
            return nums[0] + nums[1];
        }
}

//Exercise from CodingBat
