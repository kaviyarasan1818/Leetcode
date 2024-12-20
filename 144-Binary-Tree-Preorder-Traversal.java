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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> data=new ArrayList<>();
        preorder(root,data);
        return data;
    }
    private void preorder (TreeNode node,List<Integer>data){
        if(node==null){
            return ;
        }
                data.add(node.val);
                preorder(node.left,data);
                preorder(node.right,data);
    }
}