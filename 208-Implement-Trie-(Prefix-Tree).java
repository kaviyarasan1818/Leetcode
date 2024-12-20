class TrieNode{
    TrieNode [] child = new TrieNode[26];
    boolean eos =false;
}
class Trie {
     TrieNode  root ;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
         for(char ch : word.toCharArray()){
            int i = ch - 'a';
          if(node.child[i]==null){
            node.child[i]=new TrieNode();
          }
          node=node.child[i];
         }
         node.eos= true;
    }
    
    public boolean search(String word) {
        TrieNode node = root;
        for(char ch : word.toCharArray()){
            int i = ch - 'a';
            if(node.child[i]==null){
             return false;
            }
             node=node.child[i];
        }
        return  node.eos;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char ch : prefix.toCharArray()){
            int i = ch - 'a';
            if(node.child[i]==null){
                return false;
            }
            node =node.child[i];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */