package HeapANDPriorityQueue.PriorityQueue;


import java.util.PriorityQueue;

public class KthLargestelement {


     public static int kthlarge(int[]arr , int k ){

         //minheap

         PriorityQueue<Integer> pq = new PriorityQueue<>();
         for(int el : arr){ // nlogk
             pq.add(el); // log K

             if (pq.size() > k ) pq.remove(); // log k
         }

        return pq.peek();
     }

    public static void main(String[] args) {
        int [] arr = {3 , 5 , 4 , 2 , 9};
        int k = 3;

        System.out.println(KthLargestelement.kthlarge(arr , 3));
    }
}




