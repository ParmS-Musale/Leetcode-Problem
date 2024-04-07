import java.util.Stack;

class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') left.push(i);
            else if (s.charAt(i) == '*') star.push(i);
            else {
                if (!left.isEmpty()) left.pop();
                else if (!star.isEmpty()) star.pop();
                else return false;
            }
        }

        while (!left.isEmpty()) {
            if (star.isEmpty()) return false;
            else if (left.peek() < star.peek()) {
                left.pop();
                star.pop();
            } else {
                return false;
            }
        }

        return true;
    }
}

// Example 1:

// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "(*)"
// Output: true
// Example 3:

// Input: s = "(*))"
// Output: true
