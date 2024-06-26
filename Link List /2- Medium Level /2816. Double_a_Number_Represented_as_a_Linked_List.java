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
public class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            int twiceOfVal = curr.val * 2;

            if (twiceOfVal < 10) {
                curr.val = twiceOfVal;
            } 
            else if (prev != null) { 
                curr.val = twiceOfVal % 10;
                prev.val = prev.val + 1;
            } 
            else { 
                head = new ListNode(1, curr);
                curr.val = twiceOfVal % 10;
            }

            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}

Example 1:


Input: head = [1,8,9]
Output: [3,7,8]
Explanation: The figure above corresponds to the given linked list which represents the number 189. Hence, the returned linked list represents the number 189 * 2 = 378.
Example 2:


Input: head = [9,9,9]
Output: [1,9,9,8]
Explanation: The figure above corresponds to the given linked list which represents the number 999. Hence, the returned linked list reprersents the number 999 * 2 = 1998
