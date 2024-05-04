class Solution {
    public int numRescueBoats(int[] people, int limit) {
         Arrays.sort(people);
        int left = 0 ;
        int right = people.length-1 ; 
        int boat = 0 ;
        
        while (left <= right){
            if (people[left] + people[right] <= limit){
                left++ ;
            }
            right -- ;
            boat++ ;
        }
        return boat ;
    }
}
// Example 1:

// Input: people = [1,2], limit = 3
// Output: 1
// Explanation: 1 boat (1, 2)
// Example 2:

// Input: people = [3,2,2,1], limit = 3
// Output: 3
// Explanation: 3 boats (1, 2), (2) and (3)
// Example 3:

// Input: people = [3,5,3,4], limit = 5
// Output: 4
// Explanation: 4 boats (3), (3), (4), (5)
 
