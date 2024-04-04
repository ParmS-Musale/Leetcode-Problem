class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums){
            sum += encrypt(num);
        }
        return sum ;
    }

    public int encrypt (int num){
        String str = String.valueOf(num);
        int len = str.length();
        int max = Integer.MIN_VALUE ;

        for (int i=0 ; i< str.length(); i++){
            String ch = String.valueOf (str.charAt(i));

            if (Integer.parseInt(ch) > max){
                max = Integer.parseInt(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0 ; i<len ;i++){
            sb.append (String.valueOf(max));
        }
        return Integer.parseInt(sb.toString());
    }
}



// Example 1:

// Input: nums = [1,2,3]

// Output: 6

// Explanation: The encrypted elements are [1,2,3]. The sum of encrypted elements is 1 + 2 + 3 == 6.

// Example 2:

// Input: nums = [10,21,31]

// Output: 66

// Explanation: The encrypted elements are [11,22,33]. The sum of encrypted elements is 11 + 22 + 33 == 66.

