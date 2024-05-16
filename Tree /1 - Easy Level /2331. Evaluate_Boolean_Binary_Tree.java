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
    public boolean evaluateTree(TreeNode root) {

        if (root == null) return false;

        if (root.left == null && root.right == null) {
            return root.val == 1;
        }

        boolean leftResult = evaluateTree(root.left);
        boolean rightResult = evaluateTree(root.right);

        if (root.val == 2) {
            return leftResult || rightResult;
        }
        
        if (root.val == 3) {
            return leftResult && rightResult;
        }

        return false;
    }
}

// Example 1:


// Input: root = [2,1,3,null,null,0,1]
// Output: true
// Explanation: The above diagram illustrates the evaluation process.
// The AND node evaluates to False AND True = False.
// The OR node evaluates to True OR False = True.
// The root node evaluates to True, so we return true.
// Example 2:

// Input: root = [0]
// Output: false
// Explanation: The root node is a leaf node and it evaluates to false, so we return false.
 
