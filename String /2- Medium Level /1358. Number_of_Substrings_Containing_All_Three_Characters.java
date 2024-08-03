class Solution {
    public int numberOfSubstrings(String s) {
        // BruteForce Approcah

        // int count= 0 ;
        // for(int i=0 ;i<s.length() ; i++){
        //     for(int j=i+1 ; j<=s.length() ;j++){
        //         String sub = s.substring(i,j);

        //         if(sub.contains("a") && sub.contains("b") && sub.contains("c")){
        //             count++;
        //         } 
        //     }
        // }
        // return count;

        // Optimal Solution

         int[] lastSeen = new int[3]; // last seen indices of 'a', 'b', 'c'
        Arrays.fill(lastSeen, -1); // Initialize with -1
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            lastSeen[s.charAt(i) - 'a'] = i; // Update the last seen index of the current character
            
            // Check if all three characters have been seen
            if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1) {
                // Count substrings that end at 'i' and start from the minimum of last seen indices
                int minLastSeen = Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
                count += minLastSeen + 1; // Add the number of valid substrings
            }
        }
        
        return count;
    }
}


// Example 1:

// Input: s = "abcabc"
// Output: 10
// Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 
// Example 2:

// Input: s = "aaacb"
// Output: 3
// Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 
// Example 3:

// Input: s = "abc"
// Output: 1
