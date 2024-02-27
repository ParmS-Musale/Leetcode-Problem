class Solution {
    public String firstPalindrome(String[] words) {
        for( int i=0 ; i<words.length ; i++){
            if (isPalindrome (words[i])){
                return words[i];
            }
        }
        return "" ;
    }
    
        public static boolean isPalindrome (String str){
            int left = 0 ;
            int right = str.length()-1 ;
            while(left < right){
                if (str.charAt(left) != str.charAt(right)){
                    return false;
                }
                right-- ;
                left++;
            }
            return true ;
        }
    
}


// Example 1:

// Input: words = ["abc","car","ada","racecar","cool"]
// Output: "ada"
// Explanation: The first string that is palindromic is "ada".
// Note that "racecar" is also palindromic, but it is not the first.
// Example 2:

// Input: words = ["notapalindrome","racecar"]
// Output: "racecar"
// Explanation: The first and only string that is palindromic is "racecar".
// Example 3:

// Input: words = ["def","ghi"]
// Output: ""
// Explanation: There are no palindromic strings, so the empty string is returned.
