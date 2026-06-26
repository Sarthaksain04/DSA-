package HeapANDPriorityQueue.PriorityQueue;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;


class Triplet implements Comparable<Triplet>{
    int dist ;
    int x;
    int y;

    Triplet(int dist , int x , int y ){
        this.dist = dist;
        this.x = x;
        this.y = y ;

    }


    public int compareTo(Triplet o) {
        return this.dist - o.dist;
    }
}


public class KclosestPointsOrigin {
    public ArrayList<ArrayList<Integer>> kclosest(int[][] points, int k) {

        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int[] point : points) {

            int x = point[0], y = point[1];
            int dist = x * x + y * y;
            pq.add(new Triplet(dist, x, y));
            if (pq.size() > k) pq.remove();

        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            Triplet top = pq.remove();
            ArrayList<Integer> temp = new ArrayList<>();

            temp.add(top.x);
            temp.add(top.y);

            ans.add(temp);

        }
        return ans;
    }
}
