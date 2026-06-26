package Graphs.Questions.InDFS;

import java.util.LinkedList;
import java.util.Queue;

import static Graphs.Questions.InBFS.NoofProvinces.findCircleNum;

public class NumberofProvinces {

        public static int findCircleNum(int[][]adj){
            int n = adj.length;
            int count = 0 ;
            boolean[] vis  = new boolean[n];
            for (int i = 0; i < n ; i++) {
                if (!vis[i]){
                    dfs(i , vis , adj);
                    count++;
                }
            }
            return count;
        }

        private static void dfs(int i, boolean[] vis, int[][] adj) {
            int n = adj.length;
            vis[i] = true ;

            for (int j = 0; j < n ; j++) {
                if (adj[i][j] == 1 && !vis[j]){
                    dfs(j, vis , adj);
                }
            }
        }


            public static void main(String[] args) {
                int[][] isConnected = {
                        {1,1,0},
                        {1,1,0},
                        {0,0,1}
                };
                System.out.println(findCircleNum(isConnected));
            }
        }


