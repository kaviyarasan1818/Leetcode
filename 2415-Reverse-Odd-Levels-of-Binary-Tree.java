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
    public TreeNode reverseOddLevels(TreeNode root) {
           Traverse(root.left,root.right,0);
            return root;
    }
    public void Traverse(TreeNode Tleft,TreeNode Tright,int first){
        if(Tleft==null || Tright==null){
            return;
        }
        if(first % 2 == 0){
           int  temp = Tleft.val;
           Tleft.val=Tright.val;
           Tright.val=temp;
        }
        Traverse(Tleft.left,Tright.right,first+1);
        Traverse(Tleft.right,Tright.left,first+1);
    }
}