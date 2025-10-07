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
    int max = 0; // stores the maximum diameter found

    public int diameterOfBinaryTree(TreeNode root) {
        height(root); // helper function to calculate height
        return max;   // max will have the diamet
    }

        private int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        // update max diameter if path through current node is larger
        max = Math.max(max, left + right);

        // return height of current node
        return 1 + Math.max(left, right);

        
    }
}