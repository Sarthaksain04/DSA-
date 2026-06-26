package HeapANDPriorityQueue.PriorityQueue;

import java.util.PriorityQueue;

public class Basic {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(-30);
        System.out.println("Peak: "+pq.peek());
        pq.add(35);
        System.out.println("Peak After new element add: "+pq.peek());
        System.out.println("Size of Priorty Queue: "+pq.size());
        System.out.println("Removed Element: "+pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq);

        pq.add(5) ; pq.add(8) ; pq.add(2) ; pq.add(0);
        pq.add(3) ; pq.add(1) ; pq.add(7) ; pq.add(6);

        for (int el : pq ){
            System.out.print(el+ " ");
        }


    }
}
