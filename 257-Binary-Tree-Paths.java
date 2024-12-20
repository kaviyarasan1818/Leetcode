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
    public List<String> binaryTreePaths(TreeNode root) {
        List <String> li = new ArrayList<>();
          
          search(root , "",li);
          return li;
    }

          private void search (TreeNode root ,String sk, List<String> li)
          {
            if(root.left==null && root.right==null){
                li.add(sk + root.val);
            }
             if (root.left != null) search(root.left, sk + root.val + "->", li);
              if (root.right != null) search(root.right, sk + root.val + "->", li);
          
    }
}
