package Graphs.Questions.InBFS;

import java.util.LinkedList;
import java.util.Queue;

public class NoofProvinces {

    public static int findCircleNum(int[][]adj){
         int n = adj.length;
         int count = 0 ;
         boolean[] vis  = new boolean[n];
        for (int i = 0; i < n ; i++) {
            if (!vis[i]){
                bfs(i , vis , adj);
                count++;
            }
        }
        return count;
    }

    private static void bfs(int i, boolean[] vis, int[][] adj) {
        int n = adj.length;
        vis[i] = true ;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(q.size()> 0){
            int front = q.remove();
            for (int j = 0; j < n ; j++) {
                if (adj[front][j] == 1 && !vis[j]){
                    q.add(j);
                    vis[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] isConnected = {
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };
        System.out.println(findCircleNum(isConnected));
    }
}
