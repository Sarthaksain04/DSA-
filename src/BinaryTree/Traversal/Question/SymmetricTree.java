package BinaryTree.Traversal.Question;



class TreeNodes{
      int val ;
      TreeNodes left ;
      TreeNodes right;
      TreeNodes(int val){
          this.val =val;
          this.left = null;
          this.right = null;

      }
    public static boolean isSameTree(TreeNodes root , TreeNodes root2){
        if(root == null && root2 == null) return true;
        if (root == null || root2 == null) return false;
        if (root.val != root2.val) return false;

        return isSameTree(root.left , root2.left) && isSameTree(root.right , root2.right);
    }

    public static TreeNodes inverTree(TreeNodes root) {
          if (root == null) return root;

          TreeNodes temp = root.left ;
          root.left = root.right;
          root.right = temp;
          inverTree(root.left);
          inverTree(root.right);
          return root ;

      }
    public static boolean isSymmetric(TreeNodes root){
          if (root == null) return true;
          TreeNodes.inverTree(root.left);
          return isSameTree(root.left , root.right);
    }

}



public class SymmetricTree {
    public static void main(String[] args) {
        TreeNodes root = new TreeNodes(1);
        TreeNodes a = new TreeNodes(2);
        TreeNodes b = new TreeNodes(2);

        root.left = a ;
        root.right = b;


        TreeNodes c =  new TreeNodes(3);
        TreeNodes d = new TreeNodes(4);

        a.left = c ;
        a.right = d ;





        TreeNodes e =  new TreeNodes(3);
        TreeNodes f = new TreeNodes(4);

        b.left = f ;
        b.right = e ;


        System.out.println(TreeNodes.isSymmetric(root));

    }
}
