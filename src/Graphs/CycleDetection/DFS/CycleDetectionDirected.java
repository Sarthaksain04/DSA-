package Graphs.CycleDetection.DFS;

import Graphs.CycleDetection.BFS.CycleDetectioninUndirected;

import java.util.*;

public class CycleDetectionDirected {


  static class Pair{
        int parent ;
        int child ;

        Pair(int child , int parent){
            this.child = child;
            this.parent = parent;

        }
    }

public static boolean cycledetection(List<List<Integer>> list ){
          int n = list.size();

         boolean[] visited = new boolean[n];
         boolean[] path = new boolean[n];

         dfs(list , visited , path);
         return  true  ;
}


   public static void dfs(List<List<Integer>> list , boolean[] visited  , boolean[] path) {

      Queue<Pair> q = new LinkedList<>();
           visited[0] = true;
           q.add(new Pair(0, -1));

           while (q.size() > 0){
                Pair front = q.remove();
               int node = front.child;
               int parent = front.parent;
                for (int el : list.get(node));

           }
   }


    public static void main(String[] args) {





     List<Integer> zero = new ArrayList<>();
     zero.add(1);

     List<Integer>One  = new ArrayList<>();
     One.add(0);
     One.add(2);

     List<Integer> Two  = new ArrayList<>();
     Two.add(1);
     Two.add(3);


     List<Integer> Three = new ArrayList<>();
     Three.add(1);

        List<List<Integer>> list = new ArrayList<>();
        list.add(zero);
        list.add(One);
        list.add(Two);
        list.add(Three);

        cycledetection(list);
    }
}
