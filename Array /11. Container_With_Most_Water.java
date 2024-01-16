class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;

        while (leftPointer < rightPointer) {
            int minHeight = Math.min(height[leftPointer], height[rightPointer]);
            int width = rightPointer - leftPointer;
            int currentWater = minHeight * width;
            maxWater = Math.max(maxWater, currentWater);

            // Update pointers
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return maxWater;
    }
}
