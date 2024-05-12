class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length ;
        int m = grid[0].length;

        int [][] res = new int [n-2][m-2];
        for (int i = 0; i<n-2 ; i++){
            for (int j = 0 ;j<m-2 ; j++){
                res [i][j] = getValue(grid , i ,j);
            }
        }
        return res ;
    }
    public int getValue(int [][] grid ,int x , int y){
        int res = Integer.MIN_VALUE ;
        for (int i = x ; i< x+3 ; i++){
            for(int j =y ; j<y+3 ; j++){
                res = Math.max(res ,grid[i][j]);
            }
        }
        return res ;
    }
}

// Example 1:


// Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
// Output: [[9,9],[8,6]]
// Explanation: The diagram above shows the original matrix and the generated matrix.
// Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.
// Example 2:


// Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
// Output: [[2,2,2],[2,2,2],[2,2,2]]
// Explanation: Notice that the 2 is contained within every contiguous 3 x 3 matrix in grid.
