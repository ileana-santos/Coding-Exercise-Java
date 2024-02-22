//Return the number of times that the string "hi" appears anywhere in the given string.

public int countHi(String str) {
    int count = 0;
    int index = 0;
    while ((index = str.indexOf("hi", index)) != -1) {
         count++;
         index += 2; // Move index to the position after the last match
        }
        return count;
}

//Exercise from CodingBat
