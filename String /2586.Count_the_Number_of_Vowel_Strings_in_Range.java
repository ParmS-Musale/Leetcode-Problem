class Solution {
    public int vowelStrings(String[] words, int start, int end) {
        int count = 0;

        for (int i = start; i <=end; i++) {
            int s = words[i].charAt(0);
            int e = words[i].charAt(words[i].length() - 1);

            if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
                if (e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u') {
                    count++;
                }
            }
        }

        return count;
    }
}

// Input: words = ["are","amy","u"], left = 0, right = 2
// Output: 2
// Explanation: 
// - "are" is a vowel string because it starts with 'a' and ends with 'e'.
// - "amy" is not a vowel string because it does not end with a vowel.
// - "u" is a vowel string because it starts with 'u' and ends with 'u'.
// The number of vowel strings in the mentioned range is 2.

// Example 2:
// Input: words = ["hey","aeo","mu","ooo","artro"], left = 1, right = 4
// Output: 3
// Explanation: 
// - "aeo" is a vowel string because it starts with 'a' and ends with 'o'.
// - "mu" is not a vowel string because it does not start with a vowel.
// - "ooo" is a vowel string because it starts with 'o' and ends with 'o'.
// - "artro" is a vowel string because it starts with 'a' and ends with 'o'.
// The number of vowel strings in the mentioned range is 3.
