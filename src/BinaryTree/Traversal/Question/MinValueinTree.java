package BinaryTree.Traversal.Question;


class Nodes{
      int val ;
      Nodes left ;
      Nodes right ;

      Nodes(int val){
           this.val = val ;
           this.left = null;
           this.right = null;
      }

      static int Min( Nodes root){
             if (root == null) return Integer.MAX_VALUE;

             int a = root.val;
             int b = Min(root.left);
             int c = Min(root.right);

             return Math.min(a , Math.min(b , c));

      }
}
public class MinValueinTree {
    public static void main(String[] args) {

        Nodes root = new Nodes(45);
        Nodes a = new Nodes(12);
        Nodes b = new Nodes(67);

        root.left = a ;
        root.right = b ;

        Nodes c = new Nodes(20);
        Nodes d = new Nodes(73);

        a.left = c;
        a.right = d;


        Nodes e = new Nodes(2);
        b.right = e ;

        System.out.println(Nodes.Min(root));
    }
}
