class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = 0 ;
        int n= arr1.length ;
        int m = arr2.length ; 

        for (int i =0 ;i<n ; i++){
            max = Math.max(max,arr1[i]);
        }

        int countArr[] = new int [max+1];
        for (int i=0 ; i<n ;i++){
            int element = arr1[i];
            countArr[element]++ ;
        }
        int j= 0 ;
        for (int i=0 ; i<m ;i++){
            int element = arr2[i];
            while (countArr[element]>0){
                arr1[j] = element ;
                j++ ;
                countArr[element] -- ;
            }
        }
        for (int i=0 ; i<max+1 ;i++){
            while (countArr[i]>0){
                arr1[j] = i ;
                j++ ;
                countArr[i]-- ;
            }
        }
        return arr1 ;
    }
}

// Example 1:

// Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
// Output: [2,2,2,1,4,3,3,9,6,7,19]
// Example 2:

// Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
// Output: [22,28,8,6,17,44]
