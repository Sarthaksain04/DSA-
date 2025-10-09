package StackAndQueue.Queue.PriorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortArray {
    public static void main(String[] args) {
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        p1.add(8);
        p1.add(32);
        p1.add(3);
        p1.add(14);
        int[] arr = new int[p1.size()];
        int index = 0;

        while(p1.size() >0){
          int val =  p1.poll();
          arr[index++] = val;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
