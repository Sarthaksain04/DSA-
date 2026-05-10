package BinaryTree.Traversal.Question;

import java.util.ArrayList;
import java.util.List;

class Node7{
    String val;
    Node7 left;
    Node7 right;
    Node7(String val){
        this.val = val;
        this.left = null;
        this.right = null;

    }
    public static void helper(Node7 root , int level , List<String> A ) {

        if (root == null) return ;
        if (level == A.size()) {
            A.add(root.val);
            System.out.println(root.val);
        }

        helper(root.left ,level + 1  , A);
        helper(root.right , level + 1 , A);

    }

}

public class LeftViewprint {
    public static void main(String[] args) {
        Node7 root = new Node7("1");
        Node7 a = new Node7("2");
        Node7 c = new Node7("3");
        Node7 b = new Node7("5");

        root.left = a ;
        root.right = c ;

        a.right = b ;

        Node7.helper(root, 0, new ArrayList<>());
    }
}
