package Graphs.CycleDetection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class isGraphBipartite {
  static boolean ans;

    public static boolean isBipartite(int[][] graph) {
         ans = true ;
         int n  = graph.length;
        int[] visited = new int[n];
          Arrays.fill(visited , -1);

          visited[0] = 0 ;
        for (int i = 0; i < n ; i++) {
            if (ans == false) return ans;
            if ( visited[i]== -1) bfs(i , graph , visited);
        }

        return ans;
    }

    public static void bfs (int i , int[][] adj , int[] visited) {
        Queue<Integer> q = new LinkedList<>();
        visited[i]= 0;
        q.add(i);
        while (q.size() > 0){
            int front = q.remove();
            int color = visited[front];
            for (int ele : adj[front]){
                if (visited[ele] == visited[front]){
                     ans = false;
                     return;
                }
                if (visited[ele] == -1){
                    visited[ele] = 1 - color;
                    q.add(ele);
                 }
            }
        }
    }

    public static void main(String[] args) {


        int[][] graph = {
                {1, 2, 3},
                {0, 2},
                {0, 1, 3},
                {0 ,2}
        };

        System.out.println(isBipartite(graph));

    }
}



















































