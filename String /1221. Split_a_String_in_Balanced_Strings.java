class Solution {
    public int balancedStringSplit(String s) {
        int result = 0 ;
        int balance = 0 ;

        for (char c : s.toCharArray()){
            if (c == 'L'){
                balance++ ;
            }else if (c== 'R'){
                balance-- ;
            }
            if (balance == 0){
                result++ ;
            }
        }
        return result ;
    }
}


// Example 1:

// Input: s = "RLRRLLRLRL"
// Output: 4
// Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
// Example 2:

// Input: s = "RLRRRLLRLL"
// Output: 2
// Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
// Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
// Example 3:

// Input: s = "LLLLRRRR"
// Output: 1
// Explanation: s can be split into "LLLLRRRR".
