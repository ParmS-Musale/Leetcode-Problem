class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack <Integer > stack = new Stack<>();

        int n= temperatures.length ;
        int [] result = new int[n] ;
        
        for (int i = n-1 ; i>= 0 ;i--){
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }
            if (!stack.isEmpty()){
                result[i] = stack.peek() - i ;
            }
            stack.push(i);
        }
        return result ;
    }
}

// Example 1:

// Input: temperatures = [73,74,75,71,69,72,76,73]
// Output: [1,1,4,2,1,1,0,0]
// Example 2:

// Input: temperatures = [30,40,50,60]
// Output: [1,1,1,0]
// Example 3:

// Input: temperatures = [30,60,90]
// Output: [1,1,0]
