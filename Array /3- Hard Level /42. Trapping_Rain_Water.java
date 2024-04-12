class Solution {
    public int trap(int[] height) {
        int n = height.length ;
    // calculate the left max Boundary
        int leftmax[]= new int[n];
        leftmax[0] = height[0];
        for (int i=1; i<n ;i++){
            leftmax[i] = Math.max(height[i] , leftmax[i-1]);
        } 
    // calculate the right max Boundary
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for (int i=n-2 ;i>=0 ;i--){
            rightmax[i] = Math.max(height[i] , rightmax[i+1]);
        }

        int trapwater = 0 ;
        // loop
        for (int i=0 ; i<n ;i++){
            int Waterlevel = Math.min(leftmax[i] , rightmax[i]);

            trapwater += Waterlevel - height[i];
        }
        return trapwater ;
    }
}

// Example 1:

// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
// Example 2:

// Input: height = [4,2,0,3,2,5]
// Output: 9
