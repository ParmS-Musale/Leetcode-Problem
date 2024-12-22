class Solution {
    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        long ans = 0; // Declare ans as long for storing the square of mid
        
        // Fix the for loop to a while loop with correct condition
        while (low <= high) {
            // Correct the mid calculation and handle integer overflow
            long mid = low + (high - low) / 2;
…        
        // Return the best answer found
        return (int) ans;
    }
}

// Example 1:

// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.
// Example 2:

// Input: x = 8
// Output: 2
// Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
