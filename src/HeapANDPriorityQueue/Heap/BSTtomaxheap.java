package HeapANDPriorityQueue.Heap;


class Node1{
     int val ;
     Node1 left ;
     Node1 right;

     Node1(int val){
         this.val = val;
         this.left = null;
         this.right = null;
     }
}



class Solution{

    static  int s;
    static  int[] arr ;
    static int idx  = 0;


    public static int size(Node1 root){

        if (root == null) return 0;
        return 1 + size(root.left)+ size(root.right);
    }



     public static void inArray(Node1 root){


         if (root == null) return;

         inArray(root.left);
         arr[idx++] = root.val;
         inArray(root.right);

     }
     public static void convertToMaxHeap(Node1 root){
//           arr = {1 , 2 , 3 , 4  , 5 , 6 , 7};

         int low = arr[0];
         int high = arr[arr.length - 1];



     }
}




public class  BSTtomaxheap {
    public static void main(String[] args) {

        Node1 root = new Node1(4);
        Node1 a = new Node1(2);
        Node1 b = new Node1(6);
        Node1 c = new Node1(1);
        Node1 d = new Node1(3);
        Node1 e = new Node1(5);
        Node1  f = new Node1(7);

        root.left = a ;
        root.right = b ;


        a.left = c ;
        a.right = d ;

        b.left =e;
        b.right = f ;


        Solution.s = Solution.size(root);
        Solution.arr = new int[Solution.s];

        Solution.inArray(root);


    }
}
