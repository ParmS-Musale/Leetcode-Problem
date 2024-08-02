class Solution {
    public int minSwaps(int[] nums) {
        // count windowSize
        int windowSize = 0 ;
        for(int num : nums){
            windowSize+= num ;
        }
        // Find Window in First Window
        int curZero = 0 ;
        for(int i=0; i<windowSize ; i++){
            if(nums[i] == 0){
                curZero++ ;
            }
        }
        // Solving Remaining Window
        int minZero = curZero ;
        int start = 0 ;
        int end = windowSize-1 ;
        int n = nums.length ;

        while (start < n){
            // if zero elemnet remove decrease zero counter
            if(nums[start]== 0){
                curZero-- ;
            }
            start++ ;
            // if Zero element added increment zeroo counter
            end++ ;
            if(nums[end % n ] == 0){
                curZero++ ;
            }
            minZero = Math.min(minZero , curZero);
        }
        return minZero ;
    }
}

// Example 1:

// Input: nums = [0,1,0,1,1,0,0]
// Output: 1
// Explanation: Here are a few of the ways to group all the 1's together:
// [0,0,1,1,1,0,0] using 1 swap.
// [0,1,1,1,0,0,0] using 1 swap.
// [1,1,0,0,0,0,1] using 2 swaps (using the circular property of the array).
// There is no way to group all 1's together with 0 swaps.
// Thus, the minimum number of swaps required is 1.
// Example 2:

// Input: nums = [0,1,1,1,0,0,1,1,0]
// Output: 2
// Explanation: Here are a few of the ways to group all the 1's together:
// [1,1,1,0,0,0,0,1,1] using 2 swaps (using the circular property of the array).
// [1,1,1,1,1,0,0,0,0] using 2 swaps.
// There is no way to group all 1's together with 0 or 1 swaps.
// Thus, the minimum number of swaps required is 2.
