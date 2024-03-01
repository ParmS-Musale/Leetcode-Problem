class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String [] words = s.split("\\s+");

        for (String word : words){
            StringBuilder temp = new StringBuilder( word );
                temp.reverse();
                sb.append(temp);
                sb.append (" ");
        }
        return sb.toString().trim ();
    }
}

// Example 1:

// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"
// Example 2:

// Input: s = "Mr Ding"
// Output: "rM gniD"
