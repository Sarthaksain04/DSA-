package Graphs.Questions.InBFS;

// it is a directed graph question

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysandRoom {
    public static boolean canVisitAllRooms(List<List<Integer>> adj) {
    int n = adj.size();
    boolean[] visited = new boolean[n]; //false
    visited[0] = true ;
    bfs(0, adj , visited);
    for (boolean ele : visited){
        if (ele == false) return false;
    }
    return true ;
    }

    private static void bfs(int start , List<List<Integer>> adj , boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (q.size() > 0){
            int front = q.remove();
            for(int ele : adj.get(front)){
                if (!visited[ele]){
                    visited[ele] = true;
                    q.add(ele);
                }
            }
        }
    }
    public static void main(String[] args) {


        List<Integer> room1 = new ArrayList<>();
         room1.add(1) ;
         room1.add(3) ;

        List<Integer> room2 = new ArrayList<>();

        room2.add(3);
        room2.add(0);
        room2.add(1);


        List<Integer> room3 = new ArrayList<>();
        room3.add(2);


        List<Integer> room4 = new ArrayList<>();
        room4.add(0);



        List<List<Integer>> adj = new ArrayList<>();

        adj.add(room1);
        adj.add(room2);
        adj.add(room3);
        adj.add(room4);

        System.out.println(canVisitAllRooms(adj));


    }
}
