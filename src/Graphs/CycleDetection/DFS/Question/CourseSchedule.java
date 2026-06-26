package Graphs.CycleDetection.DFS.Question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

    static boolean ans;

    public static boolean canFinish(int n , int [][] prerequisites  ){
        ans = true;

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n ; i++) {

            int course = prerequisites[i][0];
            int prereq = prerequisites[i][1];
            adj.get(prereq).add(course);
        }
        boolean[] visited = new boolean[n];
        boolean[] path = new boolean[n];

        dfs(0, adj , visited , path );

        return ans;
    }

    public static void dfs(int start ,  List<List<Integer>> adj , boolean[] visited , boolean [] path ){

        visited[start] = true;
        path[start] = true;

        for (int ele : adj.get(start)) {
            if (path[ele] == true){
                ans = false;
                return;
            }
            if (visited[ele] == false) dfs(ele , adj , visited, path);
        }
       path[start] = false;

    }
    public static void main(String[] args) {

        int[][] prerequisites = {

                {3 ,2},
                {1 ,0},
                {2 ,1},
                {4 ,3},
                {0 ,3}

        };

      boolean an =   canFinish(prerequisites.length, prerequisites);
        System.out.println(an);
    }
}
