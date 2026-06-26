package BinarySearchTree.InterviewQuestion;

class TreeNode5{
      int val ;
      TreeNode5 left ;
      TreeNode5 right ;

      TreeNode5(int val){
           this.val = val;

      }
}

class Solution {
    public TreeNode5 insertIntoBST(TreeNode5 root, int val) {
        if (root == null) return new TreeNode5(val);

        // Insertion
        if (root.val > val) {
            if (root.left == null) root.left = new TreeNode5(val);
            else insertIntoBST(root.left, val);
        } else {
            if (root.right == null) root.right = new TreeNode5(val);
            else insertIntoBST(root.right, val);
        }
        return root;

    }
    public TreeNode5 bstFromPreorder(int [] preorder){
           TreeNode5 root = new TreeNode5(preorder[0]);
           return root ;
    }

}

public class ConstructBSTfromPreOrderTraversal {
    public static void main(String[] args) {

    }
}
