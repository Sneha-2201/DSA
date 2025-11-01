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
    public int rangeSumBST(TreeNode root, int low, int high) {
if (root == null) return 0;

        // Case 1: node value smaller than range → go right
        if (root.val < low)
            return rangeSumBST(root.right, low, high);

        // Case 2: node value greater than range → go left
        if (root.val > high)
            return rangeSumBST(root.left, low, high);

        // Case 3: node in range → add both sides + current node
        return root.val 
               + rangeSumBST(root.left, low, high) 
               + rangeSumBST(root.right, low, high);

    }
}

/*class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node == null) continue;

            if (node.val >= low && node.val <= high)
                sum += node.val;
            if (node.val > low)
                stack.push(node.left);
            if (node.val < high)
                stack.push(node.right);
        }

        return sum;
    }
}
*/