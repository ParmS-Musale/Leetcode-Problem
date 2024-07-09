/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Brute Force Approach using HashSet

        // ListNode temp = head;
        // HashSet<ListNode> nodeSet = new HashSet<>();

        // while (temp != null) {
        //     if (nodeSet.contains(temp)) {
        //         return temp;
        //     }
        //     nodeSet.add(temp);
        //     temp = temp.next;
        // }
        // return null;


        // Optimal Approach (Tortoise and hare)

          if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet, there is a cycle
            if (slow == fast) {
                slow = head;
                // Move both pointers at the same pace
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // Cycle detected, return the start node of the cycle
            }
        }
        return null; // No cycle
    }
}

// Example 1:


// Input: head = [3,2,0,-4], pos = 1
// Output: tail connects to node index 1
// Explanation: There is a cycle in the linked list, where tail connects to the second node.
// Example 2:


// Input: head = [1,2], pos = 0
// Output: tail connects to node index 0
// Explanation: There is a cycle in the linked list, where tail connects to the first node.
// Example 3:


// Input: head = [1], pos = -1
// Output: no cycle
// Explanation: There is no cycle in the linked list.
