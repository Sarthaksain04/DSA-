package BinarySearchTree;

import java.util.LinkedList;

import java.util.Queue;

class TreeNode4 {


    int val;
    TreeNode4 left;
    TreeNode4 right;

    TreeNode4(int val) {
        this.val = val;

    }

    public static TreeNode4 constructbfs(String[] arr) {
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        TreeNode4 root = new TreeNode4(x);
        Queue<TreeNode4> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < n - 1) {
            TreeNode4 temp = q.remove();
            TreeNode4 left = new TreeNode4(10);
            TreeNode4 right = new TreeNode4(100);
            if (arr[i].equals("")) left = null;

            else {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if (arr[i + 1].equals("")) right = null;
            else {
                int r = Integer.parseInt(arr[i + 1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i += 2;
        }
        return root;

    }


}


public class InorderPredecessorandSucessormethod2 {
    static  int pred = -1;
    static int suc = -1;
    static TreeNode4 temp  = null;
    static boolean flag = false;

        public static void main(String[] args) {
            String[] arr = {"50", "30", "70", "20", "40", "60", "80" };

            TreeNode4 root = TreeNode4.constructbfs(arr);

            int val = 30 ;

            Inorder(root , val);
            System.out.println(pred);
            System.out.println(suc);




            }
    public static void Inorder( TreeNode4 root , int val ){
        if (root == null) return ;

        Inorder(root.left ,val );
        if(temp == null ) temp = root;
        else{
            if(root.val == val ) {
                pred  = temp.val;
                flag = true ;
            }
            else if(root.val > val && flag == true){
                 suc = root.val;
                 flag = false;
            }
            else {
                temp = root;
            }
        }
            Inorder(root.right , val  );
    }


    }





