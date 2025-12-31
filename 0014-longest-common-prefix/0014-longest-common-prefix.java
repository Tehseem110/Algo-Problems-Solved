class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isWordEnd = false;
}

class Trie {

    TrieNode root;

    public Trie() {
          root = new TrieNode();
    }
    
    public void insert(String word) {
           TrieNode current = root;
        
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            int index = c - 'a';
            if(current.children[index] == null){
                current.children[index] = new TrieNode();
              
            }
              current = current.children[index];
          
            
        }
        current.isWordEnd = true;
    }
    
   
   
    public String findLongestCommonPrefix(){
        TrieNode current = root;
        StringBuilder prefix = new StringBuilder();
        
        
        
    while(true){
        
        int childCount = 0;
        int childIndex = -1;
        
       for(int i = 0; i < 26 ; i++){
           
           if(current.children[i] != null){
               childCount++;
               childIndex = i;
           }
          
       }
       
       
        if(childCount != 1 || current.isWordEnd){
               break;
           }
     
       prefix.append((char) (childIndex + 'a'));
       current = current.children[childIndex];
       
    }
    return prefix.toString();
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
          Trie trie = new Trie();
        for(String str: strs){
            System.out.println(str);
            trie.insert(str);
        }
        return trie.findLongestCommonPrefix(); 
    }
}