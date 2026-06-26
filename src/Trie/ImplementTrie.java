package Trie;


public class ImplementTrie {


   static  class Node{
        Node [] children;
        boolean endofWord;


        public Node(){
            children = new Node[26]; // a --> z
            for (int i = 0; i <26 ; i++) {
                children[i] = null;
            }
            endofWord = false;

        }

    }

    static Node root = new Node();


   // insert in Trie its also can be come in Indiviual questions and can may be asked iby google amazon
    // the time compplexity is of insert is  O(L)

    public static void insert(String words){
        Node curr = root;
        for (int i = 0; i <words.length() ; i++) { // o(L)
             int idx = words.charAt(i) - 'a';
             if (curr.children[idx] == null){
                 // add new node
                    curr.children[idx] = new Node();

             }
             if(i == words.length() -1){
                 curr.children[idx].endofWord = true ;
             }
             curr = curr.children[idx];
        }
    }


    public static boolean search(String key){  // O(L)
        Node curr = root ;
        for (int i = 0; i < key.length(); i++) {
             int idx = key.charAt(i) -'a';

             Node node = curr.children[idx];

             if (curr.children[idx] == null){
                 return false ;
             }
             if (i == key.length() - 1  && curr.children[idx].endofWord == false){
                 return false;
             }

             curr = curr.children[idx];
        }
        return true;
    }


    public static void main(String[] args) {
          String words[] = {"the" , "a" , "there" , "their" , "any"};

        for (int i = 0; i < words.length ; i++) {
            insert(words[i]);
        }

        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("an"));
        
    }
}
