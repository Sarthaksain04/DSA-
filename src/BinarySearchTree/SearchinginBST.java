package BinarySearchTree;


class TreeNode{

    int val ;
    TreeNode left ;
    TreeNode right ;

    TreeNode(int val){
        this.val =  val;
        this.left = null ;
        this.right = null;
    }

    public static TreeNode searchBST(TreeNode root , int target) {
           if (root == null) return null;
           if (root.val == target) return root;
           if (root.val > target) return searchBST(root.left , target);
           if (root.val < target) return searchBST(root.right , target);

           return root;
    }
}





public class SearchinginBST {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(8);
        TreeNode a = new TreeNode(6);
        TreeNode b = new TreeNode(15);

        root.left = a ;
        root.right = b;

        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(2);

        a.left = c ;
        a.right = d ;


        TreeNode e = new TreeNode(9);
        TreeNode f = new TreeNode(10);

        b.left = e;
        b.right = f;

        TreeNode ans = TreeNode.searchBST(root , 9);
        System.out.println(ans.val);
    }
}
