class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         Map <Integer,Integer> map = new HashMap<>();
        List <Integer> result = new ArrayList<>();

        for (int nums : nums1){
            map.put(nums ,1);
        }

        for (int nums : nums2){
            if (map.containsKey(nums) && map.get(nums) == 1){
                result.add (nums);
                map.put(nums ,0);
            }
        }
        int[] answer = new int[result.size()];
        for (int i=0 ; i<result.size() ; i++){
            answer[i] = result.get(i);
        }
        return answer ;

    }
}

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.
