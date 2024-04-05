/*Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. 
You may modify and return the given array, or return a new array.*/

public int[] shiftLeft(int[] nums) {
          if (nums.length <= 1) {
            return nums; // No need to shift if the array has 0 or 1 element
        }
        
        int firstElement = nums[0]; // Store the first element
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1]; // Shift each element one position to the left
        }
        nums[nums.length - 1] = firstElement; // Move the stored first element to the end
        
        return nums;
}


//Exercise from CodingBat
