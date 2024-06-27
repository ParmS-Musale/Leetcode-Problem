class Solution {
    public int[] rearrangeArray(int[] nums) {
        // Brute Force Approach
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0 ;i<nums.length ;i++){
            if(nums[i] > 0) pos.add(nums[i]);
            else neg.add(nums[i]);
        }
        for(int i=0 ;i<nums.length /2 ;i++){
            nums[i*2] = pos.get(i);
            nums[i*2+1] = neg.get(i);
        }
        return nums ;
    }
}

// Example 1:

// Input: nums = [3,1,-2,-5,2,-4]
// Output: [3,-2,1,-5,2,-4]
// Explanation:
// The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
// The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
// Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
// Example 2:

// Input: nums = [-1,1]
// Output: [1,-1]
// Explanation:
// 1 is the only positive integer and -1 the only negative integer in nums.
// So nums is rearranged to [1,-1].
