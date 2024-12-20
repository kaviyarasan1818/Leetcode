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
    public boolean helper(TreeNode root, long minimum, long maximum) {
        if (root == null) return true; // Null nodes are valid

        if (!(root.val > minimum && root.val < maximum)) return false; // Value outside bounds

        boolean leftFlag = helper(root.left, minimum, root.val); // Check left subtree
        boolean rightFlag = helper(root.right, root.val, maximum); // Check right subtree

        return leftFlag && rightFlag; // Both subtrees must be valid
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE); // Use Long for safer bounds
    }
}

