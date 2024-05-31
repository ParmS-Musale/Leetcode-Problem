class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0 ;
        for (int i:nums){
            xor ^= i ;
        }
        int mask = xor & (-xor);
        int xor1 = 0;
        int xor2 = 0;

        for (int i:nums){
            if ((mask & i)== 0){
                xor1 ^= i;
            }else {
                xor2 ^= i;
            }
        }
        return new int[]{xor1 ,xor2};
    }
}

// Example 1:

// Input: nums = [1,2,1,3,2,5]
// Output: [3,5]
// Explanation:  [5, 3] is also a valid answer.
// Example 2:

// Input: nums = [-1,0]
// Output: [-1,0]
// Example 3:

// Input: nums = [0,1]
// Output: [1,0]
