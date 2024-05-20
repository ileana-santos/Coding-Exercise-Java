/*Given a string, consider the prefix string made of the first N chars of the string. 
  Does that prefix string appear somewhere else in the string? Assume that the string 
  is not empty and that N is in the range 1..str.length().*/

  public static boolean doesPrefixAppearElsewhere(String str, int N) {
        // Step 1: Extract the prefix of length N
        String prefix = str.substring(0, N);
        
        // Step 2: Check if the prefix appears again in the string starting from position N
        return str.indexOf(prefix, N) != -1;
    }


//Exercise from CodingBat
