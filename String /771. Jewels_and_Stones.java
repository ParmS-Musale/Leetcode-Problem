class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0 ;

        for (int i=0 ; i<stones.length() ; i++){
            if (jewels.indexOf (stones.charAt(i)) > -1 ){
                count +=1 ;
            }
        }
        return count ;
    }
}


// Example 1:

// Input: jewels = "aA", stones = "aAAbbbb"
// Output: 3
// Example 2:

// Input: jewels = "z", stones = "ZZ"
// Output: 0
