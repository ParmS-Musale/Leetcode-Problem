class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap <Integer , Integer> map = new HashMap <>();

        for (int i= 0 ; i<arr.length ; i++){
            map.put(arr[i] , i);
        }

        for (int i=0 ;i<arr.length ; i++){
            if (map.containsKey (2*arr[i]) && i!= map.get(2*arr[i]))
                return true ;
        }
            return false ;
    }
}


// Example 1:

// Input: arr = [10,2,5,3]
// Output: true
// Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
// Example 2:

// Input: arr = [3,1,7,11]
// Output: false
// Explanation: There is no i and j that satisfy the conditions.
