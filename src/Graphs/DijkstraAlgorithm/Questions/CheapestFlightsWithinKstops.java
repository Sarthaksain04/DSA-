package Graphs.DijkstraAlgorithm.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class CheapestFlightsWithinKstops {
  static   class Pair{
          int node;
          int  cost ;
          Pair(int node , int cost){
              this.node = node;
              this.cost = cost ;
          }
    }
    public static class Triplet{
          int node;
          int cost;
          int stops;
          Triplet(int node , int cost , int stops ){
              this.node = node;
              this.cost = cost;
              this.stops = stops;
          }
    }

    public static int findCheapestPrice(int n, List<List<Pair>> adj , int src, int dst, int k) {

      int[] ans = new int[n];
        Arrays.fill(ans , Integer.MAX_VALUE);
        ans[src] = 0 ;

        PriorityQueue<Triplet> p = new PriorityQueue<>( (a , b) -> a.stops - b.stops); // you can also use Queue 
        p.add(new Triplet(src , 0 , 0));

        while(!p.isEmpty()){
            Triplet P = p.remove();
            int node = P.node;
            int cost = P.cost;
            int stops= P.stops;
            if (stops==k+1) continue;

            for (Pair pq : adj.get(node)){
                     int totalcost = cost + pq.cost;
                     if (totalcost < ans[pq.node]){
                         ans[pq.node] = totalcost;
                         p.add(new Triplet(pq.node, totalcost  , stops + 1));
                     }
                  }
            }
        if (ans[dst] == Integer.MAX_VALUE) return -1;
        return ans[dst];
    }


    public static void main(String[] args) {

         int[][] flights = {
                 {0 , 1 , 100},
                 {1 , 2 , 100},
                 {2 , 0 , 100},
                 {1 , 3 , 600},
                 {2 , 3 , 200},
         };

         int n = 4 ;


        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < flights.length ; i++) {
              int from = flights[i][0];
              int to = flights[i][1];
              int price = flights[i][2];
              int stop = -1;

              adj.get(from).add(new Pair(to , price));
        }

        int ans = findCheapestPrice(4, adj, 0 , 3 , 1);
        System.out.println(ans);

    }
}
