package BinarySearchTree;


class TreeNode2{
      int val ;
      TreeNode2 left ;
      TreeNode2 right;

      TreeNode2(int val){
            this.val = val;
      }
    public static TreeNode2 lowestCommonAncestor(TreeNode2 root, TreeNode2 p, TreeNode2 q) {

        if(p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left , p , q);
        else if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right , p , q);
        else return root;
    }
}


public class LowestCommonAncestorinBST {
    public static void main(String[] args) {
        TreeNode2 root = new TreeNode2(8);
        TreeNode2 a = new TreeNode2(6);
        TreeNode2 b = new TreeNode2(15);

        root.left = a ;
        root.right = b;

        TreeNode2 c = new TreeNode2(1);
        TreeNode2 d = new TreeNode2(2);

        a.left = c ;
        a.right = d ;


        TreeNode2 e = new TreeNode2(9);
        TreeNode2 f = new TreeNode2(18);

        b.left = e;
        b.right = f;

        TreeNode2 g = new TreeNode2(16);

        f.left = g;

         TreeNode2 ans =  TreeNode2.lowestCommonAncestor(root , g , d );
        System.out.println(ans.val);
    }
}
