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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<Pair<TreeNode ,TreeNode >> q = new LinkedList<>();
        q.offer(new Pair<> (root,null));
        while(!q.isEmpty()){
            TreeNode xparent = null , yparent = null;
            int size = q.size();
            for(int i= 0; i<size; i++){
                Pair<TreeNode ,TreeNode> curr = q.poll();
                TreeNode node = curr.getKey();
                TreeNode parent = curr.getValue();
                
                if(node.val == x) xparent = parent ;
                if(node.val== y) yparent = parent ;

                if(node.left!=null)q.offer(new Pair<>(node.left ,node ) );
                if(node.right!=null)q.offer(new Pair<>(node.right ,node ) );

            }
            if(xparent!=null && yparent !=null){
                return xparent!=yparent;
            }
            if((xparent !=null && yparent ==null)|| (xparent ==null && yparent!=null)){
                return false;
            }
            
        }
        return false ;
        
    }
}