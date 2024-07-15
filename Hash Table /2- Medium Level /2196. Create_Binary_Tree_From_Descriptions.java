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
    public TreeNode createBinaryTree(int[][] descriptions) {
        TreeNode[] map = new TreeNode[100001];
        boolean[] child = new boolean[100001];
        for (int[] d : descriptions){
            if (map[d[0]] == null) map[d[0]] = new TreeNode(d[0]);
            TreeNode node = (map[d[1]] == null ? new TreeNode(d[1]) : map[d[1]]);
            if (d[2] == 1) map[d[0]].left = node;
            else map[d[0]].right = node;
            map[node.val] = node;
            child[d[1]] = true;
        }
        for (int[] d : descriptions)
            if (!child[d[0]])
                return map[d[0]];
        return null;
    }
}
Example 1:


Input: descriptions = [[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]
Output: [50,20,80,15,17,19]
Explanation: The root node is the node with value 50 since it has no parent.
The resulting binary tree is shown in the diagram.
Example 2:


Input: descriptions = [[1,2,1],[2,3,0],[3,4,1]]
Output: [1,2,null,null,3,4]
Explanation: The root node is the node with value 1 since it has no parent.
The resulting binary tree is shown in the diagram.
