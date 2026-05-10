package BinaryTree.Traversal.Inorder;


class Node{
     int val ;
     Node left ;
     Node right;

     Node(int val ){
         this.val = val ;
         this.left = left ;
         this.right = right ;
     }

     static void Inorder(Node root){
            if (root == null) return ;

            Inorder(root.left);
            System.out.println(root.val);
            Inorder(root.right);
     }

}


public class ImplementInorder {
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

        Node.Inorder(Root);


    }
}
