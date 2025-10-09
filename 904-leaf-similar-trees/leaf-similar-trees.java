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
    private void inorder(TreeNode root ,List<Integer> List){
        if(root==null)return ;
        inorder(root.left , List);
        if(root.left==null && root.right==null)
           List.add(root.val);
        inorder(root.right , List);
        
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer>list1 = new ArrayList<>();
        List<Integer>list2 = new ArrayList<>();
        inorder(root1 , list1) ;
        inorder(root2 ,list2);
        return list1.equals(list2);
    }
}