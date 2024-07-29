class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;

        for (int mid = 1; mid < n - 1; mid++) {
            int leftSmallerCount = 0;
            for (int i = 0; i < mid; i++) {
                if (rating[i] < rating[mid]) {
                    leftSmallerCount++;
                }
            }
            int rightGraterCount = 0;
            for (int i = mid+1; i < n; i++) {
                if (rating[i] > rating[mid]) {
                    rightGraterCount++;
                }
            }
            // increment
            count += leftSmallerCount * rightGraterCount ;
            int leftGreaterCount = mid - leftSmallerCount ;
            int rightSmallerCount = n-mid-1 - rightGraterCount ;

            // decrement
            count += leftGreaterCount * rightSmallerCount ;
        }
        return count;
    }
}


// Example 1:

// Input: rating = [2,5,3,4,1]
// Output: 3
// Explanation: We can form three teams given the conditions. (2,3,4), (5,4,1), (5,3,1). 
// Example 2:

// Input: rating = [2,1,3]
// Output: 0
// Explanation: We can't form any team given the conditions.
// Example 3:

// Input: rating = [1,2,3,4]
// Output: 4
