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
    public List<Integer> postorderTraversal(TreeNode root) {
                List<Integer> data = new ArrayList<>();
                postorder(root,data);
                return data ;
    }
    private void postorder(TreeNode node,List<Integer> data){
                 if(node == null){
                    return ;
                 }
                 postorder(node.left,data);
             postorder(node.right,data);
                  data.add(node.val);
    }
}