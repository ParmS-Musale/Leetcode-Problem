class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long res = 0, cost = 1;
        long[] conn = new long[n];
        for (int[] road : roads) {
            conn[road[0]]++;
            conn[road[1]]++;
        }
        Arrays.sort(conn);
        for (long con : conn) {
            res += con * (cost++);
        }
        return res;
    }
}

// Example 1:
// Input: n = 5, roads = [[0,1],[1,2],[2,3],[0,2],[1,3],[2,4]]
// Output: 43
// Explanation: The figure above shows the country and the assigned values of [2,4,5,3,1].
// - The road (0,1) has an importance of 2 + 4 = 6.
// - The road (1,2) has an importance of 4 + 5 = 9.
// - The road (2,3) has an importance of 5 + 3 = 8.
// - The road (0,2) has an importance of 2 + 5 = 7.
// - The road (1,3) has an importance of 4 + 3 = 7.
// - The road (2,4) has an importance of 5 + 1 = 6.
// The total importance of all roads is 6 + 9 + 8 + 7 + 7 + 6 = 43.
// It can be shown that we cannot obtain a greater total importance than 43.

// Example 2:
// Input: n = 5, roads = [[0,3],[2,4],[1,3]]
// Output: 20
// Explanation: The figure above shows the country and the assigned values of [4,3,2,5,1].
// - The road (0,3) has an importance of 4 + 5 = 9.
// - The road (2,4) has an importance of 2 + 1 = 3.
// - The road (1,3) has an importance of 3 + 5 = 8.
// The total importance of all roads is 9 + 3 + 8 = 20.
// It can be shown that we cannot obtain a greater total importance than 20.
 
