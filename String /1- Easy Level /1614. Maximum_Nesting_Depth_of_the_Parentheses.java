class Solution {
    public int maxDepth(String s) {
        int max = 0 ;
        int open_Bracket = 0 ;

        for (char ch :s.toCharArray()){
            if (ch == '('){
                open_Bracket++ ;
            }else if (ch == ')') {
                open_Bracket-- ;
            }
            max= Math.max (max ,open_Bracket);
        }
        return max ;
    }
}

// Example 1:

// Input: s = "(1+(2*3)+((8)/4))+1"
// Output: 3
// Explanation: Digit 8 is inside of 3 nested parentheses in the string.
// Example 2:

// Input: s = "(1)+((2))+(((3)))"
// Output: 3
