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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
      List<List<Integer>>result = new ArrayList<>();
      List<Integer> currentPath = new ArrayList<>();
      dfs(root,targetSum,currentPath,result);
      return result;  
        
    }
    private void dfs(TreeNode root, int targetSum , List<Integer>currentPath , List<List<Integer>>result){

        if(root== null) return; //empty node stop

        currentPath.add(root.val);

        if(root.left==null && root.right==null && root.val == targetSum){
            result.add(new ArrayList<>(currentPath));
        }else{
            dfs(root.left , targetSum-root.val ,currentPath ,result);
            dfs(root.right , targetSum-root.val ,currentPath ,result);

        } 
        currentPath.remove (currentPath.size()-1);//backtrack before returning to previous call

    }
}