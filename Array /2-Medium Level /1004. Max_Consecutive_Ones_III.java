class Solution {
    public int longestOnes(int[] nums, int k) {
        //Bruteforce Approach
    //     int max = 0;
    //     for( int i=0 ; i<nums.length ;i++){
    //         int count = 0 ;
    //         for( int j=i ; j<nums.length ;j++){
    //             if (nums[j] == 0){
    //                 count++ ; 
    //             }
    //             if(count > k){
    //                 break ;
    //             }
    //         max = Math.max (max, j-i+1);
    //         }
    //     }
    //     return max ;

    // Optimal Solution

    int max= 0 ;
    int i = 0 ;
    int count = 0 ;

    for (int j=0 ;j<nums.length ;j++){
        if(nums[j] == 0){
            count++ ;
        }

        while(count > k){
            if(nums[i] == 0){
                count-- ;
            }
            i++ ;
        }
        max = Math.max (max, j-i+1);
    }
    return max;
    }
}

// Example 1:

// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
// Example 2:

// Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
// Output: 10
// Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
