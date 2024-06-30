class Solution {
    public String largestOddNumber(String num) {
        // Start from the last character of the string
        int n = num.length() - 1;

        // Loop until we find an odd digit or reach the start of the string
        while (n >= 0) {
            // Get the digit at the current position
            int d = num.charAt(n) - '0';

            // Check if the digit is odd
            if (d % 2 != 0) {
                // If it's odd, return the substring from the start to this position
                return num.substring(0, n + 1);
            }
            // Move to the previous character
            n--;
        }

        // If no odd digit is found, return an empty string
        return "";
    }
}

// Example 1:

// Input: num = "52"
// Output: "5"
// Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
// Example 2:

// Input: num = "4206"
// Output: ""
// Explanation: There are no odd numbers in "4206".
// Example 3:

// Input: num = "35427"
// Output: "35427"
// Explanation: "35427" is already an odd number.
