package Graphs.DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstrathroughHeap {
        static class Pair{
            int node;
            int distance;

            Pair(int node , int distance){
                this.node = node;
                this.distance = distance;

            }
        }

        public static int[] Dijkstra(List<List<Pair>> adj, int src  ){

            int [] dist = new int[adj.size()];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[src] = 0;
            PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.distance - b.distance);

            pq.add(new Pair(src , 0));

            while(!pq.isEmpty()){
                 Pair top = pq.remove();

                 int node  = top.node;

                 for (Pair p : adj.get(node)){
                    int  totaldist = top.distance + p.distance;

                    if (dist[p.node] > totaldist){
                        dist[p.node] = totaldist;
                        pq.add(new Pair(p.node , totaldist));
                    }
                 }

            }
            return dist;
        }

        public static void main(String[] args) {
            List<List<Pair>> adj = new ArrayList<>();

            int n = 4 ;
            for (int i = 0; i < n ; i++) {
                adj.add(new ArrayList<>());

            }

            adj.get(0).add(new Pair(1,4));

            adj.get(0).add(new Pair(2,1));

            adj.get(1).add(new Pair(3,2));

            adj.get(2).add(new Pair(3,3));

            int src = 0 ;

            int [] ans = Dijkstra(adj, src);

            System.out.println(Arrays.toString(ans));

        }
}
