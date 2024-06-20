class Solution {

    static boolean find(int arr[], int x, int m){
        int n = arr.length;

        int b = 1;
        int prev = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]-prev>=x){
                b++;
                prev = arr[i];
            }
        }
        if(b>=m) return true;
        return false;
    }
    public int maxDistance(int[] arr, int m) {
        Arrays.sort(arr);

        int n = arr.length;
        int st = 1;
        int end = arr[n-1]-arr[0];
        int ans  = -1;
        while(st<=end){
            int mid = st+(end-st)/2;

            if(find(arr,mid,m)){
                ans = mid;
                st = mid+1;
            }else end = mid-1;
        }
        return ans;
    }
}

// Example 1:


// Input: position = [1,2,3,4,7], m = 3
// Output: 3
// Explanation: Distributing the 3 balls into baskets 1, 4 and 7 will make the magnetic force between ball pairs [3, 3, 6]. The minimum magnetic force is 3. We cannot achieve a larger minimum magnetic force than 3.
// Example 2:

// Input: position = [5,4,3,2,1,1000000000], m = 2
// Output: 999999999
// Explanation: We can use baskets 1 and 1000000000.
