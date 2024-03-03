class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for ( int i=0 ; i<image.length ; i++){
            int start = 0 ;
            int end = image.length - 1 ;

            while (start <= end){
                if (image[i][start] == image[i][end]){
                    image[i][end] = 1 - image[i][end];
                    image[i][start] = image[i][end];
                }
                start++ ;
                end-- ; 
            }
        }
        return image ;
    }
}


// Example 1:

// Input: image = [[1,1,0],[1,0,1],[0,0,0]]
// Output: [[1,0,0],[0,1,0],[1,1,1]]
// Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
// Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
// Example 2:

// Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
// Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
// Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
// Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
