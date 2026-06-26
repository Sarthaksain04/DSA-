package Graphs.TopologicalSort;

// Kahn's Algorithm


import java.util.*;

public class TopologicalSortThroughBFS {

    public static  int[] findOrder(int length, List<List<Integer>> ele ) {
        int[] indegree = new int[length];
          int count = 0;

        for (int i = 0; i < length ; i++) {
            for (int e : ele.get(i)) {
                indegree[e]++;

            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < length; i++) {


            if (indegree[i] == 0) {
                q.add(i);
            }
        }

            int[] ans = new int[length];
            int idx = 0;
            while (q.size() > 0){
                  int front = q.remove();
                ans[idx++] = front;

                for (int el : ele.get(front)){
                      indegree[el]--;

                      if (indegree[el] == 0 ){
                          q.add(el);
                      }

                  }
            }

        return ans;
    }

        public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);


        List<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(4);


        List<Integer> c = new ArrayList<>();


        List<Integer> d = new ArrayList<>();

        d.add(2);

        List<Integer> e = new ArrayList<>();
        e.add(3);
        e.add(2);


        List<List<Integer>> list = new ArrayList<>();

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        int length = list.size();

            int[] ans =  findOrder(length , list);

            System.out.println(Arrays.toString(ans));
    }
}
