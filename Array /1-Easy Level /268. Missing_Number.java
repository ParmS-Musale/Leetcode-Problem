class Solution {
    public int missingNumber(int[] nums) {
        // Brute Force Approach
    //     for (int i = 0; i <= nums.length; i++) {  // Iterate from 0 to nums.length
    //         int flag = 0;
    //         for (int j = 0; j < nums.length; j++) {  // Iterate over the entire array
    //             if (nums[j] == i) {
    //                 flag = 1;
    //                 break;
    //             }
    //         }
    //         if (flag == 0) {
    //             return i;
    //         }
    //     }
    //     return -1;  // This case should never occur for a valid input
    // }

    // Optimal Approacoh 1
//     int N =nums.length ;
//     int sum = (N * ( N + 1 )) /2 ;

//     int s2 = 0 ;
//     for (int i=0 ; i<N ;i++){
//         s2 += nums[i] ;
//     }
//    return sum-s2 ; 
// }

    // OPtimal Approach 2

    int xor1 = 0, xor2 = 0;

        // XOR of array elements and indices
        for (int i = 0; i < nums.length; i++) {
            xor2 = xor2 ^ nums[i]; // XOR of array elements
            xor1 = xor1 ^ i; // XOR of indices
        }
        
        xor1 = xor1 ^ nums.length; // XOR with last index which is nums.length
        
     return xor1 ^ xor2; // the missing number
    }

}
// Example 1:

// Input: nums = [3,0,1]
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
// Example 2:

// Input: nums = [0,1]
// Output: 2
// Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
// Example 3:

// Input: nums = [9,6,4,2,3,5,7,0,1]
// Output: 8
// Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
