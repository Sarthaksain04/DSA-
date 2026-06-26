package HeapANDPriorityQueue.Heap;


import java.util.ArrayList;

class Node2 {
    int val ;
    Node2 left ;
    Node2 right;

    Node2(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}


public class BSTtoMAXheapmethod2 {

    static  int idx ;

    public static void convertTOMAxHeap(Node2 root){

        idx = 0 ;
        ArrayList<Integer> in = new ArrayList<>();
        inorder(root , in );
        postorder(root , in);

    }

    private static void postorder(Node2 root, ArrayList<Integer> in) {
        if(root == null ) return ;
        postorder(root.left , in );
        postorder(root.right , in );
        root.val = in.get(idx++);



    }

    private static void inorder(Node2 root , ArrayList<Integer> in ) {
        if(root == null ) return ;
        inorder(root.left , in );
        in.add(root.val);
        inorder(root.right , in );


    }

    public   static void  display(Node2 root){

        if (root == null) return;
        System.out.print(root.val+ " ->  ");
        if(root.left !=null ){
            System.out.print(root.left.val+ " ,");
        }
        if (root.right != null){
            System.out.print(root.right.val);
        }
        System.out.println();
        display(root.left);
        display(root.right);

    }



    public static void main(String[] args) {

        Node2 root = new Node2(4);
        Node2 a = new Node2(2);
        Node2 b = new Node2(6);
        Node2 c = new Node2(1);
        Node2 d = new Node2(3);
        Node2 e = new Node2(5);
        Node2  f = new Node2(7);

        root.left = a ;
        root.right = b ;


        a.left = c ;
        a.right = d ;

        b.left =e;
        b.right = f ;

        convertTOMAxHeap(root);
        display(root);



    }
}
