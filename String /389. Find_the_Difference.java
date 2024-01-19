class Solution {
    public char findTheDifference(String s, String t) {
    
        int total = 0;

        for (int i = 0; i < t.length(); i++) {
            total += t.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            total -= s.charAt(i);
        }

        return (char) total;
    }
}
// output :-
// Input: s = "abcd", t = "abcde"
// Output: "e"
// Explanation: 'e' is the letter that was added.
