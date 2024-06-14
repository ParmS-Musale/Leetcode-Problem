class Solution {
    public int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(num, max);
        }
        return max;
    }

    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums); // Sort the array first
        int moves = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) { // If current number is not greater than previous
                int increment = nums[i - 1] + 1 - nums[i]; // Calculate required increment
                nums[i] += increment; // Increment the current number
                moves += increment; // Accumulate the moves
            }
        }
        return moves;
    }
}

// Example 1:

// Input: nums = [1,2,2]
// Output: 1
// Explanation: After 1 move, the array could be [1, 2, 3].
// Example 2:

// Input: nums = [3,2,1,2,1,7]
// Output: 6
// Explanation: After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
// It can be shown with 5 or less moves that it is impossible for the array to have all unique values.
