package Graphs.CycleDetection.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


// Kahn's Algorithm

public class CycleDetectionDirected {
    public static boolean bfs( List<List<Integer>> adj) {
        int length = adj.size();

        int[] indegree = new int[length];

     int count = 0 ;

        // indegree

        for (int i = 0; i < length ; i++) {
            for (int ele : adj.get(i)) {
                  indegree[ele]++;
            }
        }


        //  Put First element in Queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < length; i++) {

            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // breadth First search

        int[] ans = new int[length];
        int idx = 0;
        while(q.size() > 0){
              int front = q.remove();
              count++;
              ans[idx++] = front;

            for (int ele : adj.get(front)){
                  indegree[ele]--;

                  if (indegree[ele] == 0 ){
                      q.add(ele);
                  }


              }

        }

        if(count == length){
            return false; // No cycle
        }
        else{
            return true;  // Cycle exists
        }
    }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(2);



        List<Integer> b = new ArrayList<>();

        b.add(1);
        b.add(3);


        List<Integer> c = new ArrayList<>();

        c.add(2);

        List<Integer> d = new ArrayList<>();
        d.add(1);
        d.add(3);


        List<List<Integer>> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        int size = list.size() ;

        boolean[] visited = new boolean[size];

        System.out.println(bfs( list));
      }
    }

