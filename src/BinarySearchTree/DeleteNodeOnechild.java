package BinarySearchTree;


class TreeNode1 {

    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }


    public static void delete (TreeNode1 root , int target){
           if (root ==null) return ;
           if (root.val > target){
                if (root.left == null) return ;
                if (root.left.val == target) {
                    if (root.left.left == null || root.left.right == null){
                        if (root.left.left != null) root.left = root.left.left;
                       else root.left = root.left.right;
                    }
                   else delete(root.left , target);
                }
            }
           else {
               if (root.right == null) return;
               if (root.right.val == target){
                   if (root.right.left == null || root.right.right == null){
                       if(root.right.right != null ) root.right = root.right.right;
                       else root.right = root.right.left;
                   }
               }
               else  delete(root.right , target);
           }


    }
    public static  void preorder(TreeNode1 root){
        if (root == null) return ;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
}




public class DeleteNodeOnechild {

    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(8);
        TreeNode1 a = new TreeNode1(6);
        TreeNode1 b = new TreeNode1(15);

        root.left = a ;
        root.right = b;

        TreeNode1 c = new TreeNode1(1);
        TreeNode1 d = new TreeNode1(2);

        a.left = c ;
        a.right = d ;


        TreeNode1 e = new TreeNode1(9);
        TreeNode1 f = new TreeNode1(18);

        b.left = e;
        b.right = f;

        TreeNode1 g = new TreeNode1(16);

        f.left = g;


        TreeNode1.delete(root , 18);
        TreeNode1.preorder(root);


    }

}
