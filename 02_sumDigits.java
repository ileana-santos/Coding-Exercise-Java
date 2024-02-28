/*Given a non-negative int n, return the sum of its digits recursively (no loops). 
  Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).*/

public int sumDigits(int n) {
      // Base case: if n is less than 10, it means n is a single digit number, so return n
        if (n < 10) {
            return n;
        } else {
            // Recursive case: sum the rightmost digit (n % 10) with the sum of digits of the remaining number (n / 10)
            return n % 10 + sumDigits(n / 10);
        }
}

//Exercise from CodingBat
