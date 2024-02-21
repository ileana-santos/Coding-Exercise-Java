/* Given an array of ints length 3, figure out which is larger, 
the first or last element in the array, and set all the other 
elements to be that value. Return the changed array. */

public int[] maxEnd3(int[] nums) {
   // Check if the first element is larger or if the last element is larger
        int larger = (nums[0] > nums[2]) ? nums[0] : nums[2];

        // Set all elements of the array to the larger value
        nums[0] = larger;
        nums[1] = larger;
        nums[2] = larger;

        return nums;
}

//Exercise from CodingBat
