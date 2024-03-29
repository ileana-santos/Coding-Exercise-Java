/*Given two strings, return true if either of the strings appears at the very end of the other string, 
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). 
Note: str.toLowerCase() returns the lowercase version of a string.*/

public boolean endOther(String a, String b) {
  String lowerA = a.toLowerCase();
  String lowerB = b.toLowerCase();
  
  return lowerA.endsWith(lowerB) || lowerB.endsWith(lowerA);
}


//Exercise from CodingBat
