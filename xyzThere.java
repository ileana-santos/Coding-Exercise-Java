//Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

public boolean xyzThere(String str) {
  int count = 0;
  
  for (int i = 0; i <= str.length() - 2; i++){
    if (str.startsWith("xyz", i) && (i == 0 || str.charAt(i - 1) != '.')){
      return true;
    }
  }
  return false;
}

//Exercise from CodingBat
