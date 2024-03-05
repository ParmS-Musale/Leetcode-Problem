class Solution {
    public int removePalindromeSub(String s) {
        int start = 0;
        int end = s.length() - 1;

        if (s.length() == 0) {
            return 0;
        }

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return 2;
            }
            start++;
            end--;
        }
        return 1;
    }
}


// Example 1:

// Input: s = "ababa"
// Output: 1
// Explanation: s is already a palindrome, so its entirety can be removed in a single step.
// Example 2:

// Input: s = "abb"
// Output: 2
// Explanation: "abb" -> "bb" -> "". 
// Remove palindromic subsequence "a" then "bb".
// Example 3:

// Input: s = "baabb"
// Output: 2
// Explanation: "baabb" -> "b" -> "". 
// Remove palindromic subsequence "baab" then "b".
