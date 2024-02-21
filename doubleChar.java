//Given a string, return a string where for every char in the original, there are two chars.

public String doubleChar(String str) {
        StringBuilder result = new StringBuilder();

        // Iterate through each character of the original string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Append each character twice to the result string
            result.append(ch).append(ch);
        }

        return result.toString();
    }

//Exercise from CodingBat
