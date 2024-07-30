import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // BruteForce Approach
    //    if(s.length()==0)
    //          return 0;
    //     int max = Integer.MIN_VALUE;
    //     for (int i = 0; i < s.length(); i++) // outer loop for traversing the string
    //     {
    //         HashSet < Character > set = new HashSet < > ();
    //         for (int j = i; j < s.length(); j++) // nested loop for getting different 
    //         {
    //             if (set.contains(s.charAt(j))) // if element if found so mark it as ans 
    //             {
    //                 max = Math.max(max, j - i);
    //                 break;
    //             }
    //             set.add(s.charAt(j));
    //         }
    //     }
    //     return max;

        // Optimal Approach

        HashMap < Character, Integer > mpp = new HashMap < Character, Integer > ();

        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) {
            if (mpp.containsKey(s.charAt(right))) left = Math.max(mpp.get(s.charAt(right)) + 1, left);

            mpp.put(s.charAt(right), right);

            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
}
