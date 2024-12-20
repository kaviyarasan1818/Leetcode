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
    public int minDepth(TreeNode root) {
          
           return  depth(root);
    }
    private   int  depth (TreeNode root){
        int c=0;
        int min=Integer.MAX_VALUE;
             if(root==null)return c;
             if( root.right==null&&root.left!=null ){
                 c= depth(root.left);
             }
            else if(  root.left==null&&root.right!=null){
                c=depth(root.right);
    }
    else{
       c = Math.min(depth(root.left),depth(root.right));
    }
       return  c+1;
    }

    
    
}