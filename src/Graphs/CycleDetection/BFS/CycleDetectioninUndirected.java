package Graphs.CycleDetection.BFS;

import Graphs.CycleDetection.DFS.CycleDetectionDirected;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CycleDetectioninUndirected {

    static class Pair {
        int child;
        int parent;

        Pair(int child, int parent) {
            this.child = child;
            this.parent = parent;
        }
    }

    public static boolean bfs(int start, List<List<Integer>> adj, boolean[] visited) {
        Queue<Pair> q = new LinkedList<>();

        visited[start] = true;
        q.add(new Pair(start, -1));

        while (q.size() > 0) {
            Pair front = q.remove();

            int node = front.child;
            int parent = front.parent;

            for (int ele : adj.get(node)) {
                if (!visited[ele]) {
                    visited[ele] = true;
                    q.add(new Pair(ele, node));
                } else if (ele != parent) {

                    return true;
                }

            }
        }

        return false;
    }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);


        List<Integer> b = new ArrayList<>();

        b.add(1);
        b.add(3);


        List<Integer> c = new ArrayList<>();

        c.add(2);
        c.add(4);

        List<Integer> d = new ArrayList<>();
        d.add(1);
        d.add(3);


        List<List<Integer>> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        boolean[] visited = new boolean[list.size()];

        System.out.println(bfs(1, list, visited));
    }
}
