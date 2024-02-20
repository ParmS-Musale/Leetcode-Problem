class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int ans =0 ;

        int [] temp = new int [points.length];

        for (int i=0 ; i<points.length ;i++){
            temp[i] = points[i][0];
        }
        Arrays.sort(temp);

        for(int i=1 ; i<points.length ;i++){
            ans = Math.max (ans ,temp[i] - temp[ i-1]);
        }
        return ans;
    }
}

// Input: points = [[8,7],[9,9],[7,4],[9,7]]
// Output: 1
// Explanation: Both the red and the blue area are optimal.
// Example 2:

// Input: points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
// Output: 3
