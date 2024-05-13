class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int res = (1 << (m - 1)) * n;  

        for (int j = 1; j < m; ++j) {
            int val = 1 << (m - 1 - j);
            int set = 0;

            for (int i = 0; i < n; ++i) {
                if (grid[i][j] == grid[i][0]) {
                    set++;
                }
            }

            res += Math.max(set, n - set) * val;
        }

        return res;
    }
}

// Example 1:


// Input: grid = [[0,0,1,1],[1,0,1,0],[1,1,0,0]]
// Output: 39
// Explanation: 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
// Example 2:

// Input: grid = [[0]]
// Output: 1
