class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map <Integer ,String > map = new HashMap <>();
        for ( int i=0 ; i<names.length ;i++){
            map.put (heights[i] , names[i]);
        }
        Arrays.sort(heights);
        String[] sortedNames = new String[names.length];
        int index =0 ; 
        for (int i= heights.length-1 ; i>= 0 ; i--){
            sortedNames[index] = map.get(heights[i]);
            index ++ ;
        }
        return sortedNames ;
    }
}


// Example 1:

// Input: names = ["Mary","John","Emma"], heights = [180,165,170]
// Output: ["Mary","Emma","John"]
// Explanation: Mary is the tallest, followed by Emma and John.
// Example 2:

// Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
// Output: ["Bob","Alice","Bob"]
// Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
