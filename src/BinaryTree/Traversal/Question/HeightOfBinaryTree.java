package BinaryTree.Traversal.Question;


 class Node4{
      int val ;
      Node4  left ;
      Node4  right;
      Node4(int val ){
           this.val = val;
           this.left = null;
           this.right = null;
      }

      public static int height(Node4 root){
          if (root == null) return 0 ;
          if (root.left == null && root.right == null) return 0 ;
          return 1 + Math.max(height(root.left) , height(root.right));

     }
     public static int level(Node4 root){
         if (root == null) return 0 ;
         return 1 + Math.max(height(root.left) , height(root.right));

     }
 }

public class HeightOfBinaryTree {
    public static void main(String[] args) {

        Node4 root = new Node4(1);
        Node4 b = new Node4(4);
        Node4 c = new Node4(7);

        root.left = b ;
        root.right = c ;


        Node4 d = new Node4(2);
        Node4 e = new Node4(5);

        b.left = d;
        b.right = e;

        Node4 f = new Node4(8);

        c.right = f ;

        Node4 g = new Node4(9);
        f.left = g ;

        System.out.println(Node4.height(root) );


    }
}
