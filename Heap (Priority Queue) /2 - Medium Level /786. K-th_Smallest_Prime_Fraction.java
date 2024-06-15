class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        
        int n = arr.length;
        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((x, y) -> Double.compare     ((double)y[0] / y[1], (double)x[0] / x[1]));
        
        for (int i = 0 ; i < n ; i++) {
            for  (int j = i+1 ; j < n ; j++) {
                maxHeap.add(new int[] {arr[i], arr[j]});
                if (maxHeap.size() > k) maxHeap.poll();
            }
        }
        
        return maxHeap.peek();
    }
}

// Example 1:

// Input: arr = [1,2,3,5], k = 3
// Output: [2,5]
// Explanation: The fractions to be considered in sorted order are:
// 1/5, 1/3, 2/5, 1/2, 3/5, and 2/3.
// The third fraction is 2/5.
// Example 2:

// Input: arr = [1,7], k = 1
// Output: [1,7]
