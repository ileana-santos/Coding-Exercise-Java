/*Given a string, does "xyz" appear in the middle of the string? To define middle,
  we'll say that the number of chars to the left and right of the "xyz" must differ 
  by at most one. This problem is harder than it looks.*/


public boolean xyzMiddle(String str) {
        int len = str.length();
        String target = "xyz";
        int targetLen = target.length();

        // If the string is too short to contain "xyz"
        if (len < targetLen) {
            return false;
        }

        // Calculate possible middle positions
        int mid = len / 2;
        if (len % 2 == 0) {
            // For even length, check two positions
            int leftMiddle = mid - targetLen / 2;
            int rightMiddle = mid - targetLen / 2 - 1;
            boolean leftMiddleCheck = str.substring(leftMiddle, leftMiddle + targetLen).equals(target);
            boolean rightMiddleCheck = str.substring(rightMiddle, rightMiddle + targetLen).equals(target);
            return leftMiddleCheck || rightMiddleCheck;
        } else {
            // For odd length, check one position
            int middle = mid - targetLen / 2;
            return str.substring(middle, middle + targetLen).equals(target);
        }

//Exercise from Codingbat
