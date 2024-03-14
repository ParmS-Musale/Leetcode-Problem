class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        
        for (String str : words) {
            sb.append(str);
            
            if (sb.toString().equals(s)) {
                return true;
            } else if (sb.length() > s.length()) {
                return false; // If the concatenated string is longer than s, it can't be a prefix
            }
        }
        
        return false; // If no match is found in the loop
    }
}


// Example 1:

// Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
// Output: true
// Explanation:
// s can be made by concatenating "i", "love", and "leetcode" together.
// Example 2:

// Input: s = "iloveleetcode", words = ["apples","i","love","leetcode"]
// Output: false
// Explanation:
// It is impossible to make s using a prefix of arr.
