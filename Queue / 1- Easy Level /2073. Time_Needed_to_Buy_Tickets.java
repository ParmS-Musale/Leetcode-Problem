class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue <Integer> queue = new LinkedList<>();
        for (int i=0 ;i<tickets.length ; i++){
            queue.add(i);
        }
        int seconds =0 ;
        while (!queue.isEmpty()){
            seconds++ ;

            int person = queue.poll();
            if (tickets[person] >= 1){
                tickets[person]--;
            }
            if (person == k && tickets[person] == 0){
                break ;
            }
            if (person != k && tickets[person] == 0){
                continue ;
            }
            queue.add(person);
        }
        return seconds;
    }
}

Example 1:

Input: tickets = [2,3,2], k = 2
Output: 6
Explanation: 
- In the first pass, everyone in the line buys a ticket and the line becomes [1, 2, 1].
- In the second pass, everyone in the line buys a ticket and the line becomes [0, 1, 0].
The person at position 2 has successfully bought 2 tickets and it took 3 + 3 = 6 seconds.
Example 2:

Input: tickets = [5,1,1,1], k = 0
Output: 8
Explanation:
- In the first pass, everyone in the line buys a ticket and the line becomes [4, 0, 0, 0].
- In the next 4 passes, only the person in position 0 is buying tickets.
The person at position 0 has successfully bought 5 tickets and it took 4 + 1 + 1 + 1 + 1 = 8 seconds.
