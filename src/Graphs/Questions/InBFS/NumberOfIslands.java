package Graphs.Questions.InBFS;

// BFS

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    public static int numIslands(char[][] grid){
        int m = grid.length , n = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n  ; j++) {
             if (grid[i][j] == '1' && visited[i][j] == false){
                 bfs(i , j , visited , grid);
                 count++;
             }
            }
        }
        return  count  ;
    }

   static class  Pair{
          int row ;
          int col ;
          Pair(int row , int col){
              this.row  =row;
              this.col  = col;
          }
    }

    public  static void bfs( int i , int j , boolean[][] visited ,    char[][] grid){
        int m = grid.length , n = grid[0].length;
        Queue <Pair> q = new LinkedList<>();
        visited[i][j] = true;
        q.add(new Pair(i , j));
         while (q.size() > 0){
              Pair front = q.remove();
              int row = front.row , col = front.col;
              // top --> row - 1 , col

             if(row > 0 ){
                  if (visited[row - 1 ][col] == false && grid[row - 1 ][col] == '1'){
                      q.add(new Pair(row - 1 , col));
                      visited[row - 1][col] = true;
                  }
             }

             // bottom

             if(row + 1 < m ){
                 if (visited[row + 1 ][col] == false && grid[row + 1 ][col] == '1'){
                     q.add(new Pair(row + 1 , col));
                     visited[row + 1][col] = true;
                 }
             }
             if(col +1  < n ){
                 if (visited[row ][col + 1 ] == false && grid[row  ][col + 1 ] == '1'){
                     q.add(new Pair(row  , col + 1));
                     visited[row ][col + 1 ] = true;
                 }
             }

         }
    }
    public static void main(String[] args) {

          char[][] grid = {
                  {'1' , '1' , '1' , '1' , '0'},
                  {'1' , '1' , '0' , '1' , '0'},
                  {'1' , '1' , '0' , '0' , '0'},
                  {'0' , '0' , '0' , '0' , '0'}

          };
        System.out.println(numIslands(grid));
    }
}
