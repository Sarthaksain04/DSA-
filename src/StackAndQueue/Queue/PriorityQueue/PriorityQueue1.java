package StackAndQueue.Queue.PriorityQueue;

import java.util.*;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.offer(10); // also add element
        pq.add(30);
        pq.add(5);
        while(pq.size() >0){
            System.out.println(pq.poll());
        }
        System.out.println("Peek: " + pq.peek());

        // 3️⃣ Poll (remove the head)
        System.out.println("Poll: " + pq.poll());
        System.out.println("After poll: " + pq);

        pq.remove(30);
        System.out.println("After removing 30: " + pq);

        // 5️⃣ Check if element exists
        System.out.println("Contains 15? " + pq.contains(15));
        System.out.println("Contains 30? " + pq.contains(30));
        System.out.println("Size: " + pq.size());

        // 7️⃣ Iterate through PriorityQueue
        System.out.print("Iterating: ");
        for (Integer i : pq) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 8️⃣ Remove all elements
        while (!pq.isEmpty()) {
            System.out.println("Removing: " + pq.poll());
        }
        System.out.println("PriorityQueue empty? " + pq.isEmpty());


    }
}
