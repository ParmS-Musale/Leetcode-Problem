class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        List<double[]> workers = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            workers.add(new double[]{(double) wage[i] / quality[i], (double) quality[i]});
        }
        
        workers.sort(Comparator.comparingDouble(a -> a[0]));
        
        double ans = Double.MAX_VALUE;
        double qualitySum = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (double[] worker : workers) {
            double ratio = worker[0];
            qualitySum += worker[1];
            pq.offer(worker[1]);
            
            if (pq.size() > k) {
                qualitySum -= pq.poll();
            }
            
            if (pq.size() == k) {
                ans = Math.min(ans, qualitySum * ratio);
            }
        }

        return ans;
    }
}

// Example 1:

// Input: quality = [10,20,5], wage = [70,50,30], k = 2
// Output: 105.00000
// Explanation: We pay 70 to 0th worker and 35 to 2nd worker.
// Example 2:

// Input: quality = [3,1,10,10,1], wage = [4,8,2,2,7], k = 3
// Output: 30.66667
// Explanation: We pay 4 to 0th worker, 13.33333 to 2nd and 3rd workers separately.
