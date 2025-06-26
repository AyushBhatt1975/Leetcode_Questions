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
    private int max_Diameter = 0;

    private int helper_fcn(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = helper_fcn(root.left);
        int right = helper_fcn(root.right);
        max_Diameter = Math.max(max_Diameter, left + right);
        return Math.max(left, right) + 1;

    }

    public int diameterOfBinaryTree(TreeNode root) {
        helper_fcn(root);
        return max_Diameter;

    }
}