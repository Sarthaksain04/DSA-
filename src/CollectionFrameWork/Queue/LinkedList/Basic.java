package CollectionFrameWork.Queue.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Basic {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        list.add(1); // enqueue
        list.add(2); // enqueue
        list.add(3); // enqueue
        System.out.println(list);
        Integer i = list.remove(); // dequeue
        System.out.println(list);
        System.out.println(list.element());
    }
}
