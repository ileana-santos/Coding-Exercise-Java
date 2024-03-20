/*Given an array of ints, return true if every 2 that appears in the array is next to another 2.*/

public boolean twoTwo(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                // Check if the current 2 is not at the beginning or end of the array
                if (i > 0 && nums[i - 1] == 2) {
                    continue; // 2 is next to another 2
                }
                // Check if the current 2 is not at the end of the array
                if (i < nums.length - 1 && nums[i + 1] == 2) {
                    continue; // 2 is next to another 2
                }
                return false; // If 2 is not next to another 2, return false
            }
        }
        return true; // If no single 2 found, or all 2s are next to another 2, return true
}

//Exercise from CodingBat
