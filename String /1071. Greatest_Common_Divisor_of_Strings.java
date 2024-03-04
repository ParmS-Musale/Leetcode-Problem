class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (str2.length() > str1.length()){
            return gcdOfStrings (str2, str1);
        }
        if (str1.equals (str2)){
            return str1 ;
        }
        if (str1.startsWith(str2)){
            return gcdOfStrings (str1.substring (str2.length()) , str2);
        }
        return "";
    }
}


// Example 1:

// Input: str1 = "ABCABC", str2 = "ABC"
// Output: "ABC"
// Example 2:

// Input: str1 = "ABABAB", str2 = "ABAB"
// Output: "AB"
// Example 3:

// Input: str1 = "LEET", str2 = "CODE"
// Output: ""
