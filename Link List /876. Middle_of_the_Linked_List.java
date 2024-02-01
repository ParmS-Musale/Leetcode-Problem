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
    public ListNode middleNode(ListNode head) {
        ListNode a_pointer = head;
        ListNode b_pointer = head;

        while ( b_pointer != null && b_pointer.next != null ){
            a_pointer = a_pointer.next ;
            b_pointer = b_pointer.next.next ;
        }
        return a_pointer ;
    }
}


// Example 1:

// Input: head = [1,2,3,4,5]
// Output: [3,4,5]
// Explanation: The middle node of the list is node 3.
