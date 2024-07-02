class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        // Two-Pointer Approach
        
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0; // Initialize pointers
        while (i < nums1.length && j < nums2.length) { // Correct the syntax here
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) { // Fix the comparison condition
                j++;
            } else {
                res.add(nums1[i]); // Add the common element
                i++;
                j++;
            }
        }
        
        // Convert ArrayList to int array
        int[] result = new int[res.size()];
        for (int k = 0; k < res.size(); k++) {
            result[k] = res.get(k);
        }
        return result;
    }
}

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.
