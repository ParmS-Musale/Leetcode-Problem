class Solution {
    public boolean isHappy(int n) {
        HashSet <Integer> set = new HashSet<>();
        while (true){
            int sum = 0 ; 
            while (n != 0){
                sum += (int)Math.pow(n%10 , 2.0);
                n = n/10 ;
            }
            if (sum == 1 ) return true ;
            n = sum ;

            if (set.contains(n))
            return false;
            set.add(n);
        }
    }
}

// Example 1:

// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1
// Example 2:

// Input: n = 2
// Output: false
 
