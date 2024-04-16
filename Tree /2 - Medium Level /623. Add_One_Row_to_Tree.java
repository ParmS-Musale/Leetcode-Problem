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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1){
            TreeNode node = new TreeNode(val);
            node.left = root ;
            return node; 
        }
        insert (root ,depth , val ,1);
        return root;
    }

public void insert (TreeNode node , int depth , int val, int currDepth){
    if (node== null) return ;
    if (currDepth == depth-1){
        TreeNode temp = node.left ;
        node.left = new TreeNode(val);
        node.left.left = temp ;
        temp = node.right ;
        node.right = new TreeNode(val);
        node.right.right = temp ;
    }else {
        insert (node.left ,depth ,val ,currDepth+1);
        insert (node.right ,depth ,val ,currDepth+1);
    }
}
}

// Example 1:


// Input: root = [4,2,6,3,1,5], val = 1, depth = 2
// Output: [4,1,1,2,null,null,6,3,1,5]
// Example 2:


// Input: root = [4,2,null,3,1], val = 1, depth = 3
// Output: [4,2,null,1,1,3,null,null,1]
