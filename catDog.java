//Return true if the string "cat" and "dog" appear the same number of times in the given string.

public boolean catDog(String str) {
  int dogCount = 0;
  int catCount = 0;
  
  for (int i = 0; i <= str.length()- 3; i++){
    if(str.substring(i, i + 3).equals("cat")){
      catCount++;
    }else if (str.substring(i, i + 3).equals("dog")){
      dogCount++;
    }
  }
   return catCount == dogCount;
}

//Exercise from CodingBat
