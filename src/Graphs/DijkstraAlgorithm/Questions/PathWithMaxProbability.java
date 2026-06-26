package Graphs.DijkstraAlgorithm.Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PathWithMaxProbability {

    static class Pair{
        int node;
        double prob;

        Pair(int node , double prob){
            this.node = node;
            this.prob = prob;

        }
    }


     public double maxProbablity(int n , int [][] edges , double[] succProb , int start , int end ) {

         List<List<Pair>> adj = new ArrayList<>();
         for (int i = 0; i < n; i++)
             adj.add(new ArrayList<>());

         for (int j = 0; j < edges.length; j++) {
                 int u = edges[j][0], v = edges[j][1];
                 double prob = succProb[j];

                 adj.get(u).add(new Pair(v, prob));
                 adj.get(v).add(new Pair(u, prob));

             }
             double[] ans = new double[n];
             ans[start] = 1.0 ;
             PriorityQueue<Pair> pq = new PriorityQueue<>( (a,b) -> Double.compare(b.prob, a.prob));

             pq.add(new Pair(start , 1.0));
             while(!pq.isEmpty()){

                 Pair front  = pq.remove();

                 int node = front.node;


                 if (front.prob < ans[node] ) continue;


                 for (Pair P : adj.get(node)) {
                     double totalprob = front.prob * P.prob;
                     if (totalprob > ans[P.node]){
                         ans[P.node] = totalprob;
                         pq.add(new Pair(P.node , totalprob));

                     }
                 }
             }
            return ans[end];
         }


    public static void main(String[] args) {

        int n = 3;

        int[][] edges = {
                {0, 1},
                {1, 2},
                {0, 2}
        };

        double[] succProb = {
                0.5,
                0.3,
                0.2
        };

        int start = 0;
        int end = 1;

        PathWithMaxProbability obj =
                new PathWithMaxProbability();

        double ans =
                obj.maxProbablity(
                        n,
                        edges,
                        succProb,
                        start,
                        end
                );

        System.out.println(ans);
    }
}
