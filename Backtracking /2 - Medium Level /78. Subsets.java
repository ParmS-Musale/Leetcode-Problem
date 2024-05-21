class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

        backtrack (resultList , new ArrayList<>() , nums , 0);
        return resultList ;
    }
    public void backtrack(List<List<Integer>>resultSets,List<Integer>tempSets , int[] nums , int start){
        resultSets.add(new ArrayList<>(tempSets));

        for (int i = start ; i<nums.length ; i++ ){
            tempSets.add(nums[i]);
            backtrack(resultSets ,tempSets , nums , i+1);
            tempSets.remove(tempSets.size()-1);
        }
    }
}

// Example 1:

// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// Example 2:

// Input: nums = [0]
// Output: [[],[0]]
