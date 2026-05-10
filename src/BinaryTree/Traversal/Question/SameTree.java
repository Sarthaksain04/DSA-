package BinaryTree.Traversal.Question;

class Node5{
     int val ;
     Node5 left ;
     Node5 right;

     Node5(int val ){
          this.val = val ;
          this.left  = null;
          this.right = null;

     }
    public static boolean isSameTree(Node5 root , Node5 root2){
          if(root == null && root2 == null) return true;
          if (root == null || root2 == null) return false;
          if (root.val != root2.val) return false;

          return isSameTree(root.left , root2.left) && isSameTree(root.right , root2.right);
    }
}

public class SameTree {

    public static void main(String[] args) {

        Node5 root = new Node5(1);
        Node5 a = new Node5(2);
        Node5 b = new Node5(3);

        root.left = a ;
        root.right = b;


        Node5 root2 = new Node5(1);
        Node5 c = new Node5(2);
        Node5 d = new Node5(3);

        root2.left = c ;
        root2.right = d ;

        System.out.println(Node5.isSameTree(root , root2));

     }
}
