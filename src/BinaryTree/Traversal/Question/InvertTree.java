package BinaryTree.Traversal.Question;



class Tree2{
     int val ;
     Tree2 Left;
     Tree2 Right;

     Tree2(int val ){
         this.val = val;
         this.Left = null;
         this.Right = null;
     }

     public static void invert(Tree2 root){

         if (root == null) return ;

         Tree2 temp = root.Left;
         root.Left = root.Right;
         root.Right = temp;

         invert(root.Left);
         invert(root.Right);





     }


}
public class InvertTree {
    public static void main(String[] args) {
        Tree2 root = new Tree2(2);
        Tree2 a = new Tree2(1);
        Tree2 b = new Tree2(3);

        root.Left = a;
        root.Right = b;


        Tree2.invert(root);
    }
}
