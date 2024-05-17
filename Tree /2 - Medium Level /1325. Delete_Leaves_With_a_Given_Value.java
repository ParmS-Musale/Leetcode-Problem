/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null){
            return root ;
        }
        root.left = removeLeafNodes (root.left , target);
        root.right = removeLeafNodes (root.right , target);
    if(root.left == null && root.right == null && root.val == target){
        return null ;
    }
        return root ;
    }
}

// Example 1:



// Input: root = [1,2,3,2,null,2,4], target = 2
// Output: [1,null,3,null,4]
// Explanation: Leaf nodes in green with value (target = 2) are removed (Picture in left). 
// After removing, new nodes become leaf nodes with value (target = 2) (Picture in center).
// Example 2:



// Input: root = [1,3,3,3,2], target = 3
// Output: [1,3,null,null,2]
// Example 3:



// Input: root = [1,2,null,2,null,2], target = 2
// Output: [1]
// Explanation: Leaf nodes in green with value (target = 2) are removed at each step.
