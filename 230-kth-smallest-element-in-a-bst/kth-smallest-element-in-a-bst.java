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
    int count = 0;
    int result = 0;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return result;
        
    }
    private void inorder(TreeNode node , int k){
        if (node==null)return ;
        // left subtree
        inorder(node.left , k );
        //visit curr node
        count++;
        if(count ==k ){
            result = node.val;
            return ;//stop recursion
        }
        //right subtree
        inorder(node.right , k);
    }
}