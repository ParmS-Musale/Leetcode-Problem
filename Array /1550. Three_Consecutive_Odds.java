class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0 ;

        for (int i=0 ;i<arr.length ;i++){
            if (arr[i] % 2 !=0){
                count++;
                if (count == 3){
                return true ;
            } 
            }else {
                count = 0;
            }
        }
        return false;
    }
}


// Example 1:

// Input: arr = [2,6,4,1]
// Output: false
// Explanation: There are no three consecutive odds.
// Example 2:

// Input: arr = [1,2,34,3,4,5,7,23,12]
// Output: true
// Explanation: [5,7,23] are three consecutive odds.
