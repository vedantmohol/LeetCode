class Solution {
    static class Node{
        Node child[];
        boolean eow;

        public Node(){
            child = new Node[26];
            for(int i=0 ; i<26 ; i++){
                child[i] = null;
            }
            eow = false;
        }
    }
    private Node root = new Node();

    public void insert(String word){
        Node curr = root;
        for(int i=0 ; i<word.length() ; i++){
            int idx = word.charAt(i)-'a';
            if(curr.child[idx]==null){
                curr.child[idx] = new Node();
            }
            if(i==word.length()-1){
                curr.child[idx].eow = true;
            }
            curr = curr.child[idx];
        }
    }

    private String ans="";
    public void longWord(Node root, StringBuilder temp){
        if(root==null){
            return;
        }

        for(int i=0 ; i<26 ; i++){
            if(root.child[i]!=null && root.child[i].eow==true){
                temp.append((char)(i+'a'));
                if(temp.length()>ans.length()){
                    ans = temp.toString();
                }
                longWord(root.child[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public String longestWord(String[] words) {
        for(int i=0 ; i<words.length ; i++){
            insert(words[i]);
        }
        longWord(root,new StringBuilder(""));
        return ans;
    }
}