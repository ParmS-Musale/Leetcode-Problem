class Solution {
   
    public void deleteNode(ListNode node) {
        
        while (node.next.next != null) {
          
            node.val = node.next.val;
          
            node = node.next;
        }
        
        node.val = node.next.val;
       
        node.next = null;
    }
}

// Example 1:


// Input: head = [4,5,1,9], node = 5
// Output: [4,1,9]
// Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
// Example 2:


// Input: head = [4,5,1,9], node = 1
// Output: [4,5,9]
// Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
 
