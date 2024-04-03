class Solution {
    public String reverseOnlyLetters(String s) {
        
        char [] arr = s.toCharArray();

        int left = 0 ;
        int right = s.length()-1 ;

        while (left < right ){
        if (!Character.isLetter(arr[left])) left++;

        else if (!Character.isLetter(arr[right])) right--;

        else {
            char temp = arr[left];
            arr [left] = arr [right];
            arr [right] = temp ;
        left ++ ;
        right -- ;
        }
        }
        return new String (arr);
    }
}


// Example 1:

// Input: s = "ab-cd"
// Output: "dc-ba"
// Example 2:

// Input: s = "a-bC-dEf-ghIj"
// Output: "j-Ih-gfE-dCba"
// Example 3:

// Input: s = "Test1ng-Leet=code-Q!"
// Output: "Qedo1ct-eeLg=ntse-T!"
