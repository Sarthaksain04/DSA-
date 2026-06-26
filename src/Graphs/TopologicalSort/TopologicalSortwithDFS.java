package Graphs.TopologicalSort;

// Kahn's Algorithm


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopologicalSortwithDFS {
    static int idx;
    public static  int[] findOrder(int length, List<List<Integer>> ele ) {
        int[]  ans = new  int[length];

        boolean[] visited = new boolean[length];

        idx = length - 1 ;

        for (int i = 0 ; i <  length ; i++){
             if (!visited[i]) dfs(i , visited , ele , ans);
        }

        return ans ;
    }


    public static void dfs(int i , boolean[] vis ,  List<List<Integer>> adj , int[] ans ){
          vis[i] = true;

          for (int ele : adj.get(i)){
              if (!vis[ele]) {
                  dfs(ele , vis , adj ,ans);
              }
          }
          ans[idx--] = i ;
    }




    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(1);

        List<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(3);


        List<Integer> c = new ArrayList<>();
        c.add(4);
        c.add(3);

        List<Integer> d = new ArrayList<>();



        List<Integer> e = new ArrayList<>();
        e.add(3);


        List<List<Integer>> list = new ArrayList<>();

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        int n = list.size();

        int [] ans = findOrder( n , list);

        System.out.println(Arrays.toString(ans));


    }

}
