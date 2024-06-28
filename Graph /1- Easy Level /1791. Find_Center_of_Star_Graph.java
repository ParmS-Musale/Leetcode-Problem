class Solution {
    public int findCenter(int[][] edges) {
        int pair1[] = edges[0];
        int pair2[] = edges[1];

        if(pair1[0] == pair2[0] || pair1[0] == pair2[1]){
            return pair1[0];
        }
        return pair1[1];
    }
}

// Example 1:

// Input: edges = [[1,2],[2,3],[4,2]]
// Output: 2
// Explanation: As shown in the figure above, node 2 is connected to every other node, so 2 is the center.

// Example 2:
// Input: edges = [[1,2],[5,1],[1,3],[1,4]]
// Output: 1
