import java.util.HashMap;
import java.util.Map;

class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();

        // Count occurrences of characters in string s
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        // Append characters in the order specified
        for (char ch : order.toCharArray()) {
            if (!map.containsKey(ch)) {
                continue;
            }
            int count = map.get(ch);
            for (int i = 0; i < count; i++) {
                sb.append(ch);
            }
            map.remove(ch);
        }

        // Append remaining characters not in the specified order
        for (Character key : map.keySet()) {
            int count = map.get(key);
            for (int i = 0; i < count; i++) {
                sb.append(key);
            }
        }

        return sb.toString();
    }
}


// Example 1:

// Input:  order = "cba", s = "abcd" 

// Output:  "cbad" 

// Explanation: "a", "b", "c" appear in order, so the order of "a", "b", "c" should be "c", "b", and "a".

// Since "d" does not appear in order, it can be at any position in the returned string. "dcba", "cdba", "cbda" are also valid outputs.

// Example 2:

// Input:  order = "bcafg", s = "abcd" 

// Output:  "bcad" 

// Explanation: The characters "b", "c", and "a" from order dictate the order for the characters in s. The character "d" in s does not appear in order, so its position is flexible.

// Following the order of appearance in order, "b", "c", and "a" from s should be arranged as "b", "c", "a". "d" can be placed at any position since it's not in order. The output "bcad" correctly follows this rule. Other arrangements like "bacd" or "bcda" would also be valid, as long as "b", "c", "a" maintain their order.
