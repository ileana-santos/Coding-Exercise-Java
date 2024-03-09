/*Given an array of ints, return true if it contains no 1's or it contains no 4's.*/

public boolean no14(int[] nums) {
  
  boolean containOne = false;
  boolean containFour = false;
  
  for(int num : nums){
    if(num == 1){
      containOne = true;
    } else if(num == 4){
      containFour = true;
    }
  }
  return !containOne || !containFour;
}

//Exeercise form CodingBat
