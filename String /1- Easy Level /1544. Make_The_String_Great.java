class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i=0 ;i<s.length() ;i++){
            if (!stack.isEmpty() && Math.abs(stack.peek() - s.charAt(i)) == 32){
                stack.pop();
            }else{
            stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder ();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}

// Example 1:

// Input: s = "leEeetcode"
// Output: "leetcode"
// Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
// Example 2:

// Input: s = "abBAcC"
// Output: ""
// Explanation: We have many possible scenarios, and all lead to the same answer. For example:
// "abBAcC" --> "aAcC" --> "cC" --> ""
// "abBAcC" --> "abBA" --> "aA" --> ""
// Example 3:

// Input: s = "s"
// Output: "s"
