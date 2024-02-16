class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> hm = new HashMap <Integer,Integer >();

        for(int i=0 ; i<nums.length ; i++){
           if (hm.containsKey(nums[i])){
                return true ;
            }else{
                hm.put(nums[i],i);
            }
        }
        return false;
    }
}

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true
// Example 2:

// Input: nums = [1,2,3,4]
// Output: false
// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true
