package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public  class DeleteNodeZeroChild {
    public static class Node{
        int val ;
        Node left ;
        Node right;

        Node(int val){
            this.val = val ;
        }
    }

    public static Node constructbfs(String[] arr){
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1 ;
        while ( i <  n - 1){
            Node temp = q.remove();
            Node left =  new  Node(10);
            Node right = new Node(100);
            if (arr[i].equals("")) left = null;

            else{
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if (arr[i + 1 ].equals("")) right = null;
            else{
                int r = Integer.parseInt(arr[i + 1 ]);
                right.val = r ;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i+=2;
        }
        return root;
    }


    public static void main(String[] args) {
        String[] arr = {"50", "20", "60", "17", "34", "55", "89" , "10" , "" , "28" , "" , "" ,"" , "70" ,""  ,  "" , "14"};

        Node root = constructbfs(arr);
        delete(root , 14);
        preorder(root);

       }
    public static  void preorder(Node root){
        if (root == null) return ;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }



            private static void delete(Node root , int target){

                if (root == null) return ;
                if (root.left == null) return ;
                if (root.val > target) {
                    if (root.left.val == target) root.left = null;
                    else delete(root.left, target);

                    }

                else {
                    if (root.right == null) return ;
                    if (root.right.val == target) root.right = null;
                    else delete(root.right, target);

                }

    }

}
