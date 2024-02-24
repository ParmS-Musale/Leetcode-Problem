class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0 ;
        int result = 0 ; 

        if (ruleKey.equals ("type")){
            index = 1 ;
        }else if (ruleKey.equals ("color")){
            index = 2 ;
        }else {
            index =3 ;
        }
        for ( int i=0 ;i<items.size () ;i++){
            if ( items.get(i).get(index -1).equals(ruleValue)){
            result ++ ;
            }
        }
        return result ;
    }
}


// Example 1:

// Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
// Output: 1
// Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
// Example 2:

// Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
// Output: 2
// Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
