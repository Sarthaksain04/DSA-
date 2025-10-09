package StackAndQueue.Queue.Deque;

import java.util.*;
import java.util.LinkedList;

public class DequeusingSTL {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        // add , remove  , peek , poll
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.addFirst(5);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.removeFirst();
    }
}
