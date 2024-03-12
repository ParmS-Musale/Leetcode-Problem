import java.util.HashMap;
import java.util.Map;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int sum = 0;
        for (ListNode node = dummy; node != null; node = node.next) {
            sum += node.val;
            map.put(sum, node);
        }

        sum = 0;
        for (ListNode node = dummy; node != null; node = node.next) {
            sum += node.val;
            
            ListNode next = map.get(sum).next;
            node.next = next;
        }

        return dummy.next;
    }
}


// Example 1:

// Input: head = [1,2,-3,3,1]
// Output: [3,1]
// Note: The answer [1,2,1] would also be accepted.
// Example 2:

// Input: head = [1,2,3,-3,4]
// Output: [1,2,4]
// Example 3:

// Input: head = [1,2,3,-3,-2]
// Output: [1]
