package Trie;

public class StartWithProblem {
    static  class Node{
        Node[] children;
        boolean endofWord;


        public Node(){
            children = new Node[26]; // a --> z
            for (int i = 0; i <26 ; i++) {
                children[i] = null;
            }
            endofWord = false;

        }

    }

    public static void insert(String word){
        Node curr = root;
        for (int i = 0; i <word.length() ; i++) { // o(L)
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null){
                // add new node
                curr.children[idx] = new Node();

            }
            if(i == word.length() -1){
                curr.children[idx].endofWord = true ;
            }
            curr = curr.children[idx];
        }
    }

    static Node root = new Node();

    public static boolean search(String key){  // O(L)
        Node curr = root ;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) -'a';

            Node node = curr.children[idx];

            if (node == null){
                return false ;
            }
            if (i == key.length() - 1  && node.endofWord == false){
                return false;
            }

            curr = curr.children[idx];
        }
        return true;
    }

    public static boolean startWith(String prefix){
         Node curr  = root ;
        for (int i = 0; i < prefix.length() ; i++) {
            int idx = prefix.charAt(i) - 'a';


            if (curr.children[idx]  == null){
                return  false;

            }
            curr = curr.children[idx];
        }

        return true;
    }

    public static void main(String[] args) {
        String[] Words = {"apple" , "app" , "mango" , "man" , "woman"};
        String prefix = "app";

        for (int i = 0; i <Words.length ; i++) {
            insert(Words[i]);
        }

        System.out.println(startWith(prefix));

    }
}
