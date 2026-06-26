package HeapANDPriorityQueue.Heap;

// In this question we are gonna Implement Heap(A heap Is a Specialized Tree based Data Structure that functions as a binary tree) By using Array
// also tell that tree is heap is not

class Node{
     int data ;
     Node left , right ;
     Node(int d){
          data = d;
          left = right = null;
     }
}

class IsBinaryTreeMaxHeap{

       static  int s;

       boolean isHeap(Node root){
             s = size(root);
             return isMaxHeap(root) && isCBT(root , 1);
       }

       private int size(Node root){

           if (root == null) return 0;
           return 1 + size(root.left)+ size(root.right);
       }

       private boolean isCBT(Node root , int idx){
           if (root == null ) return true ;
           if (idx > s) return false ;
           return  isCBT(root.left , 2 * idx) && isCBT(root.right , 2 * idx + 1 );
       }

       private boolean isMaxHeap(Node root){
                 if (root == null)     return true;
                 int leftval = (root.left != null) ? root.left.data : Integer.MIN_VALUE;
                 int rightval = (root.right != null) ? root.right.data : Integer.MIN_VALUE;
                 if (root.data <= leftval || root.data <= rightval ) return false;
                 return isMaxHeap(root.left) && isMaxHeap(root.right);
       }


}


public class IsBinaryTreeHeap {
    public static void main(String[] args) {
           Node root = new Node(97 );
           Node a    = new Node(46);
           Node b    = new Node(37);
           Node c    = new Node(12);
           Node d    = new Node(3);
           Node e    = new Node(6);
           Node f    = new Node(9);
           Node g    = new Node(7);
           Node h    = new Node(31);



           root.left = a;
           root.right = b;

           a.left  =c ;
           a.right = d ;

           c.left = e ;
           c.right = f ;

           b.left = g ;
           b.right = h ;

        IsBinaryTreeMaxHeap n  = new IsBinaryTreeMaxHeap();
        System.out.println(n.isHeap(root));
    }


}