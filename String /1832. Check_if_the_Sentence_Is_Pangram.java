import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> alphabets = new HashSet<>();

        for (int i = 'a'; i <= 'z'; i++) {
            alphabets.add((char) i);
        }

        for (int i = 0; i < sentence.length(); i++) {
            alphabets.remove(sentence.charAt(i));
        }

        return alphabets.isEmpty();
    }
}

// Example 1:

// Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
// Output: true
// Explanation: sentence contains at least one of every letter of the English alphabet.
// Example 2:

// Input: sentence = "leetcode"
// Output: false
