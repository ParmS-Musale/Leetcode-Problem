class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0 ;
        int j = nums.length-1 ;

        while (i < j){
            if (nums[i] % 2 > nums[j] % 2){
                int temp = nums[i] ;
                nums[i] = nums[j];
                nums[j] = temp ;
            }
            if (nums[i] % 2 == 0) i++ ;
            if (nums[j] % 2 == 1) j-- ;
        }
        return nums ;
    }
}

// Example 1:

// Input: nums = [3,1,2,4]
// Output: [2,4,3,1]
// Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
// Example 2:

// Input: nums = [0]
// Output: [0]
