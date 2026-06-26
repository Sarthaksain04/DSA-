package Graphs.DijkstraAlgorithm.Questions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PathwithMinimumEffort {

    static class Pair{
         int row ;
         int col ;
         int effort;

         Pair(int row , int col , int effort ){
              this.row = row ;
              this.col = col ;
              this.effort = effort;
         }
    }

    public static int  MinEffort(int[][]adj ){
        int n = adj.length;
        int m = adj[0].length;

        int [][] ans  = new int[n][m];

        for (int i = 0; i < n  ; i++) {
            Arrays.fill(ans[i], Integer.MAX_VALUE);

        }
                ans[0][0] = 0;

                PriorityQueue<Pair> pq = new PriorityQueue<>( (a , b) -> a.effort - b.effort);
                pq.add(new Pair(0,0,0));
                      while (pq.size() > 0){
                          Pair top = pq.remove();

                          int  row = top.row , col = top.col , effort = top.effort;
                          if (row == n - 1 && col == m- 1) return effort;

                          if (row > 0){ // going up
                              int e = Math.abs(adj[row][col]- adj[row - 1][col]);
                              e = Math.max(e , effort);

                              if (e < ans[row -1 ][col]){
                                  ans[row - 1][col] = e ;
                                  pq.add(new Pair(row - 1 ,col ,e));
                              }
                          }

                          if (col > 0){ // going left
                              int e = Math.abs(adj[row][col]- adj[row ][col - 1]);
                              e = Math.max(e , effort);
                              if (e < ans[row][col - 1 ]){
                                  ans[row ][col - 1] = e ;
                                  pq.add(new Pair(row ,col -1 ,e));
                              }
                          }

                          if (row < n - 1 ){ // going down r + 1
                              int e = Math.abs(adj[row][col]- adj[row + 1][col]);
                              e = Math.max(e , effort);

                              if (e < ans[row + 1 ][col]){
                                  ans[row + 1][col] = e ;
                                  pq.add(new Pair(row + 1 ,col ,e));
                              }
                          }

                          if (col <  m -1){ // going right = col + 1
                              int e = Math.abs(adj[row][col]- adj[row ][col + 1]);
                              e = Math.max(e , effort);
                              if (e < ans[row][col + 1 ]){
                                  ans[row ][col + 1] = e ;
                                  pq.add(new Pair(row ,col +1 ,e));
                              }
                          }

                      }

        return ans [n - 1][m -1];
    }

    public static void main(String[] args) {
         int[][] heights = {
                 {1 , 2 , 2},
                 {3 , 8 , 2},
                 {5 , 3 , 5}
         };


        System.out.println(MinEffort(heights));
    }
}
