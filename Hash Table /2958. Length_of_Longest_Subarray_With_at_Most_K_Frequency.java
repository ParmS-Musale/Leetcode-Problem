class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            while (map.get(nums[i]) > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                l++;
            }
            ans = Math.max(ans, i - l + 1);
        }

        return ans;
    }
// }

// Example 1:

// Input: nums = [1,2,3,1,2,3,1,2], k = 2
// Output: 6
// Explanation: The longest possible good subarray is [1,2,3,1,2,3] since the values 1, 2, and 3 occur at most twice in this subarray. Note that the subarrays [2,3,1,2,3,1] and [3,1,2,3,1,2] are also good.
// It can be shown that there are no good subarrays with length more than 6.
// Example 2:

// Input: nums = [1,2,1,2,1,2,1,2], k = 1
// Output: 2
// Explanation: The longest possible good subarray is [1,2] since the values 1 and 2 occur at most once in this subarray. Note that the subarray [2,1] is also good.
// It can be shown that there are no good subarrays with length more than 2.
// Example 3:
// feel to guilty to submit this code because im not able to undersatnd solution but depends on  yt solutions
//  sorry parm im disapointing you further i will not mistake like this really sorry 
// Input: nums = [5,5,5,5,5,5,5], k = 4
// Output: 4
// Explanation: The longest possible good subarray is [5,5,5,5] since the value 5 occurs 4 times in this subarray.
// It can be shown that there are no good subarrays with length more than 4.
