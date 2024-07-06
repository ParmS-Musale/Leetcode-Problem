class Solution {
    public int passThePillow(int n, int time) {
        int totalRoundes = time/(n-1);
        boolean revDir = (totalRoundes % 2 !=0);
        if(revDir){
            return n- (time %(n-1));
        }else {
            return time %(n-1)+1 ;
        }
    }
}

// Example 1:

// Input: n = 4, time = 5
// Output: 2
// Explanation: People pass the pillow in the following way: 1 -> 2 -> 3 -> 4 -> 3 -> 2.
// After five seconds, the 2nd person is holding the pillow.
// Example 2:

// Input: n = 3, time = 2
// Output: 3
// Explanation: People pass the pillow in the following way: 1 -> 2 -> 3.
// After two seconds, the 3rd person is holding the pillow.
