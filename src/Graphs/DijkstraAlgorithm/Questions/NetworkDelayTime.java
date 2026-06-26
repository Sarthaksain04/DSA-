package Graphs.DijkstraAlgorithm.Questions;

import java.util.*;

// Kth tower is Transmitting signal find the minimum time in which the signal can transmit
// to all towers


public class NetworkDelayTime {
    static class Pair{
        int node;
        int time;

        Pair(int node , int time){
            this.node = node;
            this.time = time;

        }
    }


    public static int DijkstraAlgo(int k , List<List<Pair>> adj){
        int n = adj.size(); ;
        int [] ans = new int[n +1];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[k] = 0 ;
        PriorityQueue<Pair> p = new PriorityQueue<>( (a , b) -> a.time - b.time);

        p.add(new Pair(k , 0));
        while(!p.isEmpty()){

              Pair front  = p.remove();

              int node = front.node;


              if (front.time > ans[node] ) continue;


              for (Pair P : adj.get(node)) {
                  int totaltime = front.time + P.time;
                  if (totaltime < ans[P.node]){
                      ans[P.node] = totaltime;
                      p.add(new Pair(P.node , totaltime));

                  }
              }
        }

        int max = -1;
        for (int i = 0; i <n ; i++) {
            if (ans[i] == Integer.MAX_VALUE) return -1;
            max = Math.max(max, ans[i]);
        }

         return max;
    }

    public static void main(String[] args) {

//        Dummny values

//        int[][] times ={
//        {1 , 2 ,3 }
//        {1 , 2 ,3 }
//        {1 , 2 ,3 }
//        }
//        if you want to convert the matrix to adjacency list what you have to do

//        List<List<Pair>> adj = new ArrayList<>();
//
//        int n = 5 ;
//        for (int i = 0; i < n ; i++) {
//            adj.add(new ArrayList<Pair>());
//        }


//        for (int i = 0 ; i < times.length ; i++){
//          int u = times[i][0], v = times[i][1] , time = times[i][2];
//          adj.get(u).add(new Pair(v, time));
//
//        }

        List<List<Pair>> adj = new ArrayList<>();

        int n = 6 ;
        for (int i = 0; i < n ; i++) {
            adj.add(new ArrayList<Pair>());

        }

        adj.get(3).add(new Pair(1,5));

        adj.get(3).add(new Pair(5,7));

        adj.get(3).add(new Pair(2,1));

        adj.get(1).add(new Pair(4,1));

        adj.get(2).add(new Pair(4,6));

        adj.get(2).add(new Pair(5,4));


       int ans  = DijkstraAlgo(3 , adj );
        System.out.println(ans);

    }
}
