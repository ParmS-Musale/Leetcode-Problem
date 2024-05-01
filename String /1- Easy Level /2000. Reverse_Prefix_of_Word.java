class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if ( idx == -1){
            return word ;
        }
        StringBuilder sb = new StringBuilder (word.substring(0 , idx+1)).reverse();
        if (idx+1 < word.length()){
            sb.append(word.substring(idx+1));
        }
        return sb.toString();
    }
}

// Example 1:

// Input: word = "abcdefd", ch = "d"
// Output: "dcbaefd"
// Explanation: The first occurrence of "d" is at index 3. 
// Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
// Example 2:

// Input: word = "xyxzxe", ch = "z"
// Output: "zxyxxe"
// Explanation: The first and only occurrence of "z" is at index 3.
// Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
// Example 3:

// Input: word = "abcd", ch = "z"
// Output: "abcd"
// Explanation: "z" does not exist in word.
// You should not do any reverse operation, the resulting string is "abcd".
