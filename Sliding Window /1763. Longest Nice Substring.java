class Solution {
    public String longestNiceSubstring(String s) {
        if (s.length() < 2) return ""; // Base case: no nice substring possible

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Check if character breaks the "nice" condition
            if (!(s.contains(Character.toString(Character.toLowerCase(c))) &&
                  s.contains(Character.toString(Character.toUpperCase(c))))) {
                // Divide and conquer
                String left = longestNiceSubstring(s.substring(0, i));
                String right = longestNiceSubstring(s.substring(i + 1));
                return left.length() >= right.length() ? left : right;
            }
        }

        return s; // Entire string is nice
    }
}


// Example 1:

// Input: s = "YazaAay"
// Output: "aAa"
// Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
// "aAa" is the longest nice substring.
// Example 2:

// Input: s = "Bb"
// Output: "Bb"
// Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring.
// Example 3:

// Input: s = "c"
// Output: ""
// Explanation: There are no nice substrings.
