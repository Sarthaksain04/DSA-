package BinaryTree.Traversal.BreadthFirstSearchORLevelOrderTraversal;


class Node{
     int val ;
     Node left ;
     Node right ;
     Node( int val){
          this.val = val;
          this.left = null;
          this.right = null;

     }
    public static int height(Node root){
        if (root == null) return 0 ;
        if (root.left == null && root.right == null) return 0 ;
        return 1 + Math.max(height(root.left) , height(root.right));

    }
}
public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        Node Root = new Node(1);
        Node a  = new Node(2);
        Node b = new Node(3);

        Root.left  =  a  ;
        Root.right =  b ;

        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c ;
        a.right = d ;

        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e ;
        b.right=f;

        System.out.println(Node.height(Root));

    }
}

