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
    public ListNode reverseList(ListNode head) {
        ListNode tail = null;
        ListNode prev = null;
        ListNode curr = tail = head;
        ListNode next; 

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr; 
            curr = next;
        }
        head = prev;
        return head ;
    }
}
// Chill boys focus on your goals and you who you are..!!
// Example 1:
// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]

// Example 2:
// Input: head = [1,2]
// Output: [2,1]
