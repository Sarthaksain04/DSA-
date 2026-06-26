package Graphs.DijkstraAlgorithm.Questions;



// this is the shortest way to solve it 

import java.util.Arrays;
import java.util.PriorityQueue;

public class PathwithMinimumEffortOptimizedway {
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
        
        int[] r = {-1 , 0 , 1 , 0};
        int[] c = {0  ,-1 , 0 , 1};
        
        while (pq.size() > 0){
            Pair top = pq.remove();
            int  row = top.row , col = top.col , effort = top.effort;
            if (row == n - 1 && col == m- 1) return effort;

            for (int i = 0; i <=3 ; i++) {
                int newRow = row + r[i];
                int newCol = col + c[i];
                if(newRow < 0 || newCol < 0 || newRow >= n  || newCol >= m  ) continue ;
                int e = Math.abs(adj[row][col]- adj[newRow][newCol]);
                e = Math.max(e , effort);

                if (e < ans[newRow][newCol]){
                    ans[newRow][newCol] = e ;
                    pq.add(new Pair(newRow ,newCol ,e));
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
