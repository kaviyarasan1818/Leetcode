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
    public boolean isSymmetric(TreeNode root) {
      return isMetric(root.left,root.right);
    }
    private boolean isMetric(TreeNode l1,TreeNode l2){
        if(l1==null && l2==null){
            return true ;
        }
        if(l1==null||l2==null){
            return false;
        }
        return l1.val == l2.val  && isMetric(l1.left,l2.right)&&isMetric(l1.right,l2.left);
    }
}