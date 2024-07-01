class Solution {
    public String longestCommonPrefix(String[] strs) {
         // If the array is empty, return an empty string
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Sort the array
        Arrays.sort(strs);

        // Convert the first and last strings to char arrays
        char[] first = strs[0].toCharArray();
        char[] end = strs[strs.length - 1].toCharArray();

        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Compare characters of the first and last string
        for (int i = 0; i < first.length; i++) {
            if (i >= end.length || first[i] != end[i]) {
                break;
            }
            result.append(first[i]);
        }

        // Return the result as a string
        return result.toString();
    }
}

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
