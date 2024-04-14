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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null){
            return 0 ;
        }

        int sum_left_leaf = 0 ;

        if (root.left != null){
            if (root.left.left == null && root.left.right == null){
                sum_left_leaf += root.left.val ;
            }else {
                sum_left_leaf += sumOfLeftLeaves(root.left);
            }
        }

        if (root.right != null){
            if (root.right.left != null || root.right.right != null){
                sum_left_leaf += sumOfLeftLeaves(root.right);
            }
        }
        return sum_left_leaf;
    }
}

// Example 1:


// Input: root = [3,9,20,null,null,15,7]
// Output: 24
// Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
// Example 2:

// Input: root = [1]
// Output: 0
