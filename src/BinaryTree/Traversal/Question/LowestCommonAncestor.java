package BinaryTree.Traversal.Question;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
      int val ;
      TreeNode left ;
      TreeNode right ;

      TreeNode(int val){
           this.val = val;
           this.left = null;
           this.right = null;


      }
//       public static void NodetoRootpath( TreeNode root , TreeNode c , List<Integer> list , TreeNode root1){
//
//          if(root == null) return;
//
//          if (root == c) {
//               list.add(root.val);
//               return ;
//           }
//
//          if(root != c ){
//               NodetoRootpath(root.left , c , list , root1);
//               list.add(root.val);
//          }
//
//if (root == root1){
//    System.out.println(list);
//}
//
//
//
//      }

    public static void NodetoRootpath(TreeNode root, TreeNode c, List<Integer> list ){

        if(root == null) return;

        if (root == c) {
            list.add(root.val);
            return;
        }

        NodetoRootpath(root.left , c , list );

        if (!list.isEmpty()) {
            list.add(root.val);
            return;
        }
        NodetoRootpath(root.right, c , list );

        if (!list.isEmpty()) {
            list.add(root.val);
        }

      }

    }

public class LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(7);
        TreeNode g = new TreeNode(18);
        TreeNode h = new TreeNode(10);

        root.left = a ;
        root.right = b ;

        a.left = c ;
        a.right = d ;

        d.left = e ;

        b.right =f ;

        f.left = g;
        f.right = h;

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        TreeNode.NodetoRootpath(root, c, list );
        TreeNode.NodetoRootpath(root, e, list1 );


        System.out.println(list);
        System.out.println(list1);

        for (int i = 0; i < list.size() ; i++) {
             if (list1.contains(i)){
                 System.out.println(i);
             }
        }
    }
}
