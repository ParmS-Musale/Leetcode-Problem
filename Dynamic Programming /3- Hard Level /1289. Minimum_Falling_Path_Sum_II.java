class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        for (int i = 1; i < n; i++) {
            int minVal = Integer.MAX_VALUE, secondMinVal = Integer.MAX_VALUE, minIndex = -1;

            // Find the minimum and second minimum values in the previous row
            for (int j = 0; j < n; j++) {
                if (matrix[i - 1][j] < minVal) {
                    secondMinVal = minVal;
                    minVal = matrix[i - 1][j];
                    minIndex = j;
                } else if (matrix[i - 1][j] < secondMinVal) {
                    secondMinVal = matrix[i - 1][j];
                }
            }

            // Update the current row with the minimum sum for each cell
            for (int j = 0; j < n; j++) {
                if (j != minIndex) {
                    matrix[i][j] += minVal;
                } else {
                    matrix[i][j] += secondMinVal;
                }
            }
        }

        int minSum = Integer.MAX_VALUE;
        for (int val : matrix[n - 1]) {
            minSum = Math.min(minSum, val);
        }

        return minSum;
    }
}

// Example 1:


// Input: grid = [[1,2,3],[4,5,6],[7,8,9]]
// Output: 13
// Explanation: 
// The possible falling paths are:
// [1,5,9], [1,5,7], [1,6,7], [1,6,8],
// [2,4,8], [2,4,9], [2,6,7], [2,6,8],
// [3,4,8], [3,4,9], [3,5,7], [3,5,9]
// The falling path with the smallest sum is [1,5,7], so the answer is 13.
// Example 2:

// Input: grid = [[7]]
// Output: 7
