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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> Mainlist = new LinkedList<List<Integer>>();
        Queue<TreeNode>  queue = new LinkedList<TreeNode>();
        int f=0;
        if(root==null){
            return Mainlist;
        }
        queue.add(root);
        while(!queue.isEmpty()){
             List<Integer> sublist = new LinkedList<>();
             int n=queue.size();
          
             for(int i=0;i<n;i++){
                 TreeNode node=queue.poll();  
                   if(node.left != null){
                      queue.add( node.left
                );
             }
              if(node.right != null){
                 queue.add( node.right);
             }
             if(f==0){
               sublist.add(node.val);
             }
             else{
                  sublist.add(0,node.val);
             }
           
             }
             
             Mainlist.add(sublist);
             f=1-f;
        }
        
        return Mainlist;
    }
}