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
    public ListNode rotateRight(ListNode head, int k) {
        // Base case: if the list is empty or has only one node, return the head
        if (head == null || head.next == null) {
            return head;
        }

        // Count the length of the linked list
        int count = 1;
        ListNode temp = head;
        
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        
        // Connect the last node to the head to make it circular
        temp.next = head;

        // For larger k, reduce it using modulo operation
        k = k % count;
        int end = count - k; // Position of the new end node

        // Reset temp to head
        temp = head;
        
        // Move to the new end node
        while (end-- != 1) {
            temp = temp.next;
        }

        // Set the new head and break the circular connection
        head = temp.next;
        temp.next = null;

        return head;
    }
}

// Example 1:


// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]
// Example 2:


// Input: head = [0,1,2], k = 4
// Output: [2,0,1
