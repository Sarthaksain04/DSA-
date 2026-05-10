package BinaryTree.Traversal.Question;

import java.util.ArrayList;
import java.util.List;

class Tree{
      String val ;
      Tree left;
      Tree right;

      Tree(String val ){
           this.val   = val ;
           this.left  = null;
           this.right = null ;
      }

    public static void helper(Tree root , List<String> ans ,  String s ){
        if(root == null) return ;
        if(root.left == null && root.right == null){
            s  += root.val;
            ans.add(s);
            return ;
        }
        helper(root.left , ans , s+root.val+"->");
        helper(root.right , ans , s+root.val+"->");

    }
    public static List<String> binaryTreePaths(Tree root) {
        List<String> ans = new ArrayList<>();
        helper( root , ans ,  "" );
        return ans;
    }



}

public class  BinaryTreePaths {
    public static void main(String[] args) {
           Tree root = new Tree("1");
           Tree a = new Tree("2");
           Tree b = new Tree("3");
           Tree c = new Tree("5");

           root.left = a ;
           root.right = b ;

           a.right = c ;

        System.out.println(Tree.binaryTreePaths(root));

    }
}
