package Graphs.Questions.InDFS;

public class Noofislands {
    public static int numIslands(char[][] grid){
        int m = grid.length , n = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n  ; j++) {
                if (grid[i][j] == '1' && visited[i][j] == false){
                    dfs(i , j , visited , grid);
                    count++;
                }
            }
        }
        return  count  ;
    }

    public static void dfs(int i , int j ,boolean[][] visited  ,char[][] grid){
        int m = grid.length , n = grid[0].length;
        visited[i][j] = true ;
      if (i - 1 >= 0 && grid[i- 1][j] == '1' && !visited[i- 1][j] ) dfs(i-1 , j , visited , grid);
      if (i + 1 <= m - 1 && grid[i + 1][j] == '1' && !visited[i + 1][j] )  dfs(i+1 , j , visited , grid);
      if (j - 1 >= 0 && grid[i][j - 1] == '1' && !visited[i][j - 1] )  dfs(i , j - 1 , visited , grid);
      if (j + 1 < n - 1 && grid[i][j+1] == '1' && !visited[i][j+1] )  dfs(i , j + 1, visited , grid);
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
