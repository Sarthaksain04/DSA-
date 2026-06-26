package HeapANDPriorityQueue.PriorityQueue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestelement {
     public static int kthsmall(int[]arr , int k ){

         //maxheap

         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
         for(int el : arr){ // nlogk
             pq.add(el); // log K

             if (pq.size() > k ) pq.remove(); // log k
         }

        return pq.peek();
     }

    public static void main(String[] args) {
        int [] arr = {7 , 10 , 4 , 3 , 20 , 15};
        int k = 3;

        System.out.println(KthSmallestelement.kthsmall(arr , 3));
    }
}




