class Solution {
    public int findMaxLength(int[] nums) {
        Map <Integer,Integer> map = new HashMap<>();
        map.put (0,-1);

        int sum = 0 ;
        int maxLength = 0 ;

        for (int i=0 ; i<nums.length ;i++){
            if (nums[i] == 0){
                nums[i] = -1 ;
            }
        }
        for (int i=0 ;i<nums.length ;i++){
            sum += nums[i];
            if (map.containsKey(sum)){
                maxLength = Math.max(maxLength , i-map.get(sum));
            }else{
                map.put(sum ,i );
            }
        }
        return maxLength ;
    }
}

// Example 1:

// Input: nums = [0,1]
// Output: 2
// Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
// Example 2:

// Input: nums = [0,1,0]
// Output: 2
// Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
