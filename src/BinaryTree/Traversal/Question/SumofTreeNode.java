package BinaryTree.Traversal.Question;

class Node2{
       int data;
       Node2 left;
       Node2 right;
       Node2(int data){
           this.data = data ;
           this.left = null;
           this.right = null;
       }


       static int sum(Node2 root){
              if (root == null) return 0 ;
           return root.data + sum(root.left) + sum(root.right);
       }
}


public class SumofTreeNode {
    public static void main(String[] args) {
           Node2 Root = new Node2(12);
           Node2 a  = new Node2(1);
           Node2 b = new Node2(2);

           Root.left  =  a  ;
           Root.right =  b ;

           Node2 c = new Node2(4);
           Node2 d = new Node2(8);
           a.left = c ;
           a.right = d ;

           Node2 e = new Node2(9);
           b.left = e ;

        System.out.println(Node2.sum(Root));


    }
}
