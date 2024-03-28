class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for( int i=0 ; i<(n +1) / 2 ; i++){
            for (int j=0 ; j<n/2 ; j++){

                // bottom left - temp

                int temp = matrix[n-1-j][i];

                // bottom left >> bottom right

                matrix[n-1-j][i] = matrix [n-1-i][n-j-1];

                // bottom right >> top right

                matrix[n-1-i][n-j-1] = matrix [j][n-1-i];

                // bottom right >> top left

                matrix[j][n-1-i] = matrix [i][j];

                // top left >> temp

                matrix[i][j] = temp ;
            }
        }
    }
}

// Example 1:


// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[7,4,1],[8,5,2],[9,6,3]]
// Example 2:


// Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
// Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
