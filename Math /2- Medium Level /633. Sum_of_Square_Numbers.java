class Solution {
    public boolean judgeSquareSum(int c) {
        long a = 0 ;
        long b = (long) Math.sqrt(c);

        while (a<=b){
            long t = a*a + b*b ;

            if(t == c){
                return true ;
            }else if (t < c){
                a++;
            }else {
                b-- ;
            }
        }
        return false ;
    }
}

// Example 1:

// Input: c = 5
// Output: true
// Explanation: 1 * 1 + 2 * 2 = 5
// Example 2:

// Input: c = 3
// Output: false
