import java.util.Stack;

class Solution {
    public int minLength(String s) {
        Stack<Character> str = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch == 'B' && !str.isEmpty() && str.peek() == 'A') {
                str.pop();
            } else if(ch == 'D' && !str.isEmpty() && str.peek() == 'C') {
                str.pop();
            } else {
                str.push(ch);
            }
        }
        return str.size();
    }
}
