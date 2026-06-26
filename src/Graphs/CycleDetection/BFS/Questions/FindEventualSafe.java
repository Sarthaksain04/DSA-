package Graphs.CycleDetection.BFS.Questions;

import java.util.*;

public class FindEventualSafe {

    public static List<Integer> eventualSafeNodes( List<List<Integer>> adj , int[] indegree){
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < adj.size() ; i++) {
             if (indegree[i] == 0) q.add(i);
        }

        List<Integer> ans = new ArrayList<>();

        while (q.size() > 0 ){
              int front = q.remove();
              ans.add(front);
              for (int el : adj.get(front)){
                  indegree[el]--;
                  if (indegree[el] == 0 ) q.add(el);
              }
        }
        Collections.sort(ans );
        return ans;

    }

    public static void main(String[] args) {
        int[][] graph = {
                {1 , 2},
                {2 , 3},
                {5},
                {0},
                {5},
                {},
                {}
        };
        int n = graph.length;


        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            adj.add(new ArrayList<>());
        }

       int [] indegree = new int[n];

        for (int i = 0; i < n ; i++) {
           for (int ele : graph[i]){
              // in original graph , edege is from i to ele
               // in reverse graph , it will be ele -> i
               adj.get(ele).add(i);
               indegree[i]++;
           }
        }
          List<Integer> ans =  eventualSafeNodes(adj, indegree);

          System.out.println(ans);
    }
}
