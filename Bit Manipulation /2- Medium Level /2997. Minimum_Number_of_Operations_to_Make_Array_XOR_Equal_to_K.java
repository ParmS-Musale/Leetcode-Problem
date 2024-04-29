class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = nums[0];
        for (int i =1 ;i<nums.length ; i++){
            xor ^= nums[i];
        }
        if(xor == k){
            return 0 ;
        }
        return countOperations(xor , k);
    }
    public int countOperations (int x , int y){
        int diffBits = 0 ;
        for (int i = 0 ; i < 32 ; i++){
            int xLSB = ((x >> i) & 1);
            int yLSB = ((y >> i) & 1);

            if (xLSB != yLSB ){
                diffBits++ ;
            }
        }
        return diffBits ;
    }
}

// Example 1:

// Input: nums = [2,1,3,4], k = 1
// Output: 2
// Explanation: We can do the following operations:
// - Choose element 2 which is 3 == (011)2, we flip the first bit and we obtain (010)2 == 2. nums becomes [2,1,2,4].
// - Choose element 0 which is 2 == (010)2, we flip the third bit and we obtain (110)2 = 6. nums becomes [6,1,2,4].
// The XOR of elements of the final array is (6 XOR 1 XOR 2 XOR 4) == 1 == k.
// It can be shown that we cannot make the XOR equal to k in less than 2 operations.
// Example 2:

// Input: nums = [2,0,2,0], k = 0
// Output: 0
// Explanation: The XOR of elements of the array is (2 XOR 0 XOR 2 XOR 0) == 0 == k. So no operation is needed.
