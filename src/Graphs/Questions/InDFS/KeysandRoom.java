package Graphs.Questions.InDFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysandRoom   {
    public static boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n]; //false
        visited[0] = true ;
        dfs(0, adj , visited);
        for (boolean ele : visited){
            if (ele == false) return false;
        }
        return true ;
    }

    private static void dfs(int start , List<List<Integer>> adj , boolean[] visited){
        visited[start] = true;
        for (int ele : adj.get(start)) {
           if (!visited[ele]) dfs(ele , adj , visited);
        }
    }
    public static void main(String[] args) {


        List<Integer> room1 = new ArrayList<>();
        room1.add(1);
        room1.add(3);

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
