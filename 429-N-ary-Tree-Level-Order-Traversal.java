/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> MainList = new LinkedList<List<Integer>>();
            Queue<Node> queue = new LinkedList<Node>();
            if(root==null){
                return MainList;
            }
            queue.add(root);
            while(!queue.isEmpty()){
                List<Integer> sublist = new LinkedList<Integer>();
                int size =queue.size();
                for(int i=0;i<size;i++){
                  if(queue.peek(). children != null){
                 for(Node child:queue.peek().children){
                      queue.add(child);
                    }
                    
                }
                sublist.add(queue.poll().val);
              
              
            }
               MainList.add(sublist);

    }
     return MainList;
}
}