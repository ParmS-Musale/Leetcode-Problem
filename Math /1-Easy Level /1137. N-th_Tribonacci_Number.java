class Solution {
    public int tribonacci(int n) {
        
       if( n  == 0){
        return 0;
       }
       else if( n== 1 || n==2){
        return 1;
       }
       
       int t1 = 0, t2 =1 , t3 =1;
       int next;

       for(int i=3; i<=n; i++){
        next = t1 + t2 + t3;
        t1 = t2;
        t2 = t3;
        t3 = next;
       }

       return t3;

      
    }
}

// Example 1:

// Input: n = 4
// Output: 4
// Explanation:
// T_3 = 0 + 1 + 1 = 2
// T_4 = 1 + 1 + 2 = 4
// Example 2:

// Input: n = 25
// Output: 1389537
