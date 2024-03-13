class Solution {
    public int pivotInteger(int n) {
        
        if (n==1){
            return 1;
        }
        int leftValue = 1 ;
        int rightValue = n ; 
        int leftSum = leftValue ;
        int rightSum = rightValue ;

        while (leftValue < rightValue){
            if (leftSum < rightSum){
                leftValue++;
                leftSum += leftValue ;
            }else {
                rightValue-- ;
                rightSum += rightValue ;
            }
            if (leftSum == rightSum && leftValue + 1 == rightValue -1){
                return leftValue +1 ;
            }
        }
        return -1 ;
    }
}

// Example 1:

// Input: n = 8
// Output: 6
// Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
// Example 2:

// Input: n = 1
// Output: 1
// Explanation: 1 is the pivot integer since: 1 = 1.
// Example 3:

// Input: n = 4
// Output: -1
// Explanation: It can be proved that no such integer exist.
