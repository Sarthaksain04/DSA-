package Graphs.CycleDetection.BFS.Questions;

import java.util.*;

public class CourseSchedule2 {
    public static void main(String[] args) {
        int[][] prerequisites = {

                {3 ,2},
                {1 ,0},
                {2 ,1},
                {4 ,3},
                {0 ,3}

        };
        int n = prerequisites.length;

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[n];

        boolean [] visited = new boolean[n];


        for (int i = 0; i < n ; i++) {

            int course = prerequisites[i][0];
            int prereq = prerequisites[i][1];
            adj.get(prereq).add(course);
            indegree[course]++;
        }

        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            if (indegree[i] == 0) {
                q.add(i);
                visited[i] = true;
            }
        }
        while(q.size() > 0){
            int front  = q.remove();
            ans.add(front);
            for (int ele : adj.get(front)) {
                indegree[ele]--;
                if (indegree[ele] == 0 ){
                    q.add(ele) ; visited[ele] = true ;
                }
            }
        }
        int[] ans2 = new int[ans.size()];
        if (ans.size() != n) System.out.println(Arrays.toString(new int[0]));
        else System.out.println(Arrays.toString(ans2));

    }
}
