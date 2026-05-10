package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode3 {
    int val;
    TreeNode3 left;
    TreeNode3 right;

    TreeNode3(int val) {
        this.val = val;

    }

    public static TreeNode3 constructbfs(String[] arr) {
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        TreeNode3 root = new TreeNode3(x);
        Queue<TreeNode3> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < n - 1) {
            TreeNode3 temp = q.remove();
            TreeNode3 left = new TreeNode3(10);
            TreeNode3 right = new TreeNode3(100);
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

    public static void Inorder( TreeNode3 root ,  List<Integer> Arr){
            if (root == null) return ;

        Inorder(root.left , Arr);
        Arr.add(root.val);
        Inorder(root.right , Arr);
    }

}


    public class InorderPredecessorandSuccessor {
        public static void main(String[] args) {
            String[] arr = {"50", "20", "60", "17", "34", "55", "89" , "10" , "" , "28" , "" , "" ,"" , "70" ,""  ,  "" , "14"};

            TreeNode3 root = TreeNode3.constructbfs(arr);

            List<Integer> Arr  = new ArrayList<>();
            TreeNode3.Inorder(root, Arr);


            int num = 28;
            int idx = -1;
            for (int i = 0; i <Arr.size() ; i++) {
                if (Arr.get(i) == num ){
                    idx = i;
                    break;
                }
            }

         int pred = Arr.get(idx - 1 );
         int suc = Arr.get(idx+1);
            System.out.println("Pred is  : "+pred);
            System.out.println("Successot is : "+ suc);

        }

    }

