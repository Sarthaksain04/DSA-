package Graphs.Questions.InBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindifPathExistsinGraph {

    public static boolean validpath(int n , int[][] edges , int start , int end){
        if (start == end ) return true;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length ; i++) {
             int a = edges[i][0] ,  b = edges[i][1];
             adj.get(a).add(b);
             adj.get(b).add(a);

        }
        boolean[] vis = new boolean[n];
        vis[start] = true;
        bfs(start, adj,vis);
        return vis[end];

    }

    public static void bfs(int start ,  List<List<Integer>>edges , boolean[] isvisited){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (q.size() > 0){
             int front = q.remove();
            for (int ele : edges.get(front)) {
                if (!isvisited[ele]){
                    q.add(ele);
                    isvisited[ele] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] edges = {
                {0, 1},
                {0, 2},
                {3, 5},
                {5, 4},
                {4, 3}
        };

        System.out.println(validpath(6 , edges , 0 , 5));
    }
}
