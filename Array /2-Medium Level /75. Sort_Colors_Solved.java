class Solution {
    public void swap (int nums[],int i , int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp ;
        }
    public void sortColors(int[] nums) {
        int start = 0 ;
        int end = nums.length-1 ;
        int index = 0 ;

        while (index <= end){
            if (nums[index] == 0){
                swap (nums,index ,start);
                index++ ;
                start++ ;
            }else if (nums[index]==2){
                swap(nums,index,end);
                end-- ;
            }else{
                index++ ;
            }
        }        

        
    }
}

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]
