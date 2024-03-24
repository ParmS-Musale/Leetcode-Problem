class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = 0;

        while (right < arr.length) {
            // Check for space character to identify word boundaries
            if (arr[right] == ' ') {
                // Reverse the word
                reverse(arr, left, right - 1);
                // Move left pointer to the start of the next word
                left = right + 1;
            }
            right++;
        }

        // Reverse the last word or the only word if there's only one in the sentence
        reverse(arr, left, right - 1);

        return new String(arr);
    }

    // Method to reverse a portion of a character array between indices left and right
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}


// Example 1:

// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"
// Example 2:

// Input: s = "Mr Ding"
// Output: "rM gniD"
