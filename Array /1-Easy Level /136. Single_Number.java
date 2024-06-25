class Solution {
    public int singleNumber(int[] nums) {
        // BruteForce Approach

    //   for (int i = 0; i < nums.length; i++) {
    //         int number = nums[i];
    //         int count = 0;
            
    //         // Count the occurrences of the current number
    //         for (int j = 0; j < nums.length; j++) {
    //             if (nums[j] == number) {
    //                 count++;
    //             }
    //         }
            
    //         // If the count is 1, this is the unique number
    //         if (count == 1) {
    //             return number;
    //         }
    //     }
    //     return -1; // Should never reach here if input is valid
    // }

    // Optimal Approach

    int xor = 0 ;
    for (int i=0 ;i<nums.length ;i++){
        xor = xor ^ nums[i];
    }
    return xor ;
}
}

// Example 1:

// Input: nums = [2,2,1]
// Output: 1
// Example 2:

// Input: nums = [4,1,2,1,2]
// Output: 4
// Example 3:

// Input: nums = [1]
// Output: 1
