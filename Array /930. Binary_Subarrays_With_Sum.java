class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map <Integer,Integer> map = new HashMap <>();
        int count = 0 ;
        int sum = 0 ;

        for(int num : nums){
            sum += num ;
        
        if (sum == goal){
            count++ ;
        }

        if (map.containsKey (sum -goal)){
            count += map.get (sum-goal); 
        }

        map.put(sum,map.getOrDefault(sum ,0)+1);
        }
        return count;
    }
}

// Example 1:

// Input: nums = [1,0,1,0,1], goal = 2
// Output: 4
// Explanation: The 4 subarrays are bolded and underlined below:
// [1,0,1,0,1]
// [1,0,1,0,1]
// [1,0,1,0,1]
// [1,0,1,0,1]
// Example 2:

// Input: nums = [0,0,0,0,0], goal = 0
// Output: 15
