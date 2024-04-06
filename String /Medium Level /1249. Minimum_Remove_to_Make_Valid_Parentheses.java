class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder (s);
        Stack <Integer> stack = new Stack<>();

        for (int i=0 ; i<s.length(); i++){
            if (s.charAt(i) == '('){
                stack.push(i);
            }
            else if (s.charAt(i) == ')'){
                if (!stack.isEmpty()) {
                stack.pop();    
                }
            else {
                sb.setCharAt(i , '*' );
            }
            }
        }
        while (!stack.isEmpty()){
            sb.setCharAt(stack.pop() , '*');
        }
        return sb.toString ().replaceAll ("\\*" , "");
    }
}

// Example 1:

// Input: s = "lee(t(c)o)de)"
// Output: "lee(t(c)o)de"
// Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
// Example 2:

// Input: s = "a)b(c)d"
// Output: "ab(c)d"
// Example 3:

// Input: s = "))(("
// Output: ""
// Explanation: An empty string is also valid.
 
