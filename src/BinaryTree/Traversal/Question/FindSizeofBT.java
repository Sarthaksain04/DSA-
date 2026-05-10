package BinaryTree.Traversal.Question;

class Node1{
      int val ;
      Node1 left;
      Node1 right;

      Node1(int val){
           this.val =  val ;
           this.left = null;
           this.right = null;
      }

     public static void display(Node1 root){
           if (root == null) return;
          System.out.print(root.val+ " ->");
          if (root.left != null){

              System.out.print(root.left.val+ ",");
          }

          if (root.right != null){

              System.out.print(root.right.val);
          }
          System.out.println();
          display(root.left);
          display(root.right);

      }

          public static int size(Node1 root){
                 if (root == null) return 0 ;
                 return 1 + size(root.left) + size(root.right);
      }

}

public class FindSizeofBT {
    public static void main(String[] args) {
        Node1 root = new Node1(1);
        Node1 a = new Node1(2);
        Node1 b = new Node1(3);

        root.left = a ;
        root.right = b ;

        Node1 c = new Node1(4);
        Node1 d = new Node1(5);
        a.left = c;
        a.right = d;

        Node1 e = new Node1(6);
        b.right = e;

//        Node1.display(root);

        System.out.println(Node1.size(root));

    }
}
