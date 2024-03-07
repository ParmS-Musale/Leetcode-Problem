class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet <>();
        ArrayList <Integer> ans = new ArrayList<>();

        for (int i=0 ; i<nums1.length ; i++){
            set.add(nums1[i]);
        }

        for (int i=0 ; i<nums2.length ; i++){
            if (set.contains(nums2[i])){
            ans.add(nums2[i]);
            set.remove(nums2[i]);
            }
        }

    int[] arr = new int [ans.size()];

    for (int i=0 ; i<ans.size() ; i++){
        arr[i] = ans.get(i);
    }
    return arr ;
    }
}

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.
 
