class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap <Integer , Integer > map = new HashMap<>();
        int max = 0 ;

        for (int i=0 ; i<nums.length ; i++){
            if (map.containsKey (nums[i])){
                map.put(nums[i] , map.get(nums[i])+ 1);
            }else {
                map.put (nums[i] , 1);
            }
            if (map.containsKey(nums[i]) && map.get (nums[i]) > max ){
                max = map.get(nums[i]);
            }
        }
        int count = 0 ;
        ArrayList <Integer> list = new ArrayList<>(map.values());
        for (int num : list){
            if (num == max){
                count += num ;
            }
        }
        return count;
    }
}

// Example 1:

// Input: nums = [1,2,2,3,1,4]
// Output: 4
// Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
// So the number of elements in the array with maximum frequency is 4.
// Example 2:

// Input: nums = [1,2,3,4,5]
// Output: 5
// Explanation: All elements of the array have a frequency of 1 which is the maximum.
// So the number of elements in the array with maximum frequency is 5.
