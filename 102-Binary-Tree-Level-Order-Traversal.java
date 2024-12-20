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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue <TreeNode> level = new LinkedList<TreeNode>();
        List<List<Integer>> MainList = new  LinkedList<List<Integer>>();
        if(root==null){
            return MainList;
        }
        level.add(root);
     
         
         while(!level.isEmpty()){
               List<Integer> sublist =new LinkedList<Integer>();
            int l=level.size();
            for(int i=0;i<l;i++){
            if(level.peek().left!=null){
               level.add(level.peek().left);
            }
            if(level.peek().right!=null){
               level.add(level.peek().right);
            }
             sublist.add(level.poll().val);
            }
            MainList.add(sublist);
         }
         return  MainList;
    }
}