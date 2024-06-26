class Solution {
    public int majorityElement(int[] nums) {
    //     Brute Force Approach

    //     int count = 0;
    //     for (int i=0 ; i<nums.length ;i++){
    //         for (int j=0 ; j<nums.length ;j++){
    //             if(nums[i] == nums[j]){
    //                 count++ ;
    //             }
    //             if (count > nums.length/2){
    //                 return nums[i];
    //             }
    //         }
    //     }
    //     return -1;
    // }

    // Optimal Solution

    int count = 0;
        int element = 0;

        // Phase 1: Find a candidate
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                element = nums[i];
                count = 1;
            } else if (nums[i] == element) {
                count++;
            } else {
                count--;
            }
        }

        // Phase 2: Verify the candidate
        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                count1++;
            }
        }

        // Check if the candidate is indeed the majority element
        if (count1 > nums.length / 2) {
            return element;
        }

        // If no majority element is found (though the problem guarantees one)
        return -1;
    }
}

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
