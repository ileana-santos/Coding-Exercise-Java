/*Given a non-negative int n, return the count of the occurrences of 7 as a digit, 
  so for example 717 yields 2. (no loops). 
  Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).*/

public int count7(int n) {
          // Base case: if n is 0, there are no occurrences of 7
        if (n == 0) {
            return 0;
        } else {
            // Recursive case: check if the rightmost digit is 7
            // If it is, increment the count, then continue checking the remaining digits
            // If it's not, just check the remaining digits
            return (n % 10 == 7 ? 1 : 0) + count7(n / 10);
        }
}

//Exercise from CodingBat
