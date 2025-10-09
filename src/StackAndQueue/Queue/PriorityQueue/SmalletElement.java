package StackAndQueue.Queue.PriorityQueue;

import java.util.*;

public class SmalletElement {
    public static void main(String[] args) {
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        p1.add(8);
        p1.add(32);
        p1.add(3);
        p1.add(14);
        System.out.println("Smallest : " + p1.peek());
    }
}
