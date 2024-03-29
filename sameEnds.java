/*Return true if the group of N numbers at the start and end of the array are the same. 
For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, 
and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.*/

public boolean sameEnds(int[] nums, int n) {
  int len = nums.length;
        
        // Get the subarrays at the start and end of the array
        int[] start = new int[n];
        int[] end = new int[n];
        
        for (int i = 0; i < n; i++) {
            start[i] = nums[i];
            end[i] = nums[len - n + i];
        }
        
        // Compare the subarrays
        for (int i = 0; i < n; i++) {
            if (start[i] != end[i]) {
                return false;
            }
        }
        
        return true;
}

//Exercise from CodingBat
