class Solution {
    public int longestIdealString(String s, int k) {
        int n = s.length();
        int[] arr = new int[26];
        int result = 0;
        for(int i = 0; i < n; i++){
            int curr = s.charAt(i) - 'a';
            int left = Math.max(0, curr - k);
            int right = Math.min(25, curr + k);

            int longest = 0;

            for(int j = left; j <= right; j++){
                longest = Math.max(longest, arr[j]);
            }

            arr[curr] = Math.max(longest + 1, arr[curr]);
            result = Math.max(result, arr[curr]);
        }
        return result;
    }
}

// Example 1:

// Input: s = "acfgbd", k = 2
// Output: 4
// Explanation: The longest ideal string is "acbd". The length of this string is 4, so 4 is returned.
// Note that "acfgbd" is not ideal because 'c' and 'f' have a difference of 3 in alphabet order.
// Example 2:

// Input: s = "abcd", k = 3
// Output: 4
// Explanation: The longest ideal string is "abcd". The length of this string is 4, so 4 is returned.
