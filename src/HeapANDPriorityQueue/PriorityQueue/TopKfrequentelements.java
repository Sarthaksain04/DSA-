package HeapANDPriorityQueue.PriorityQueue;


import java.util.*;

class Pair implements Comparable<Pair>{
    int ele ;
    int freq ;
    Pair(int ele , int freq){
        this.ele =ele ;
        this.freq =freq;
    }


    public int compareTo(Pair p) {
        if (this.freq == p.freq) return this.ele - p.ele;
        return this.freq - p.freq;
    }
}

class Solution1 {
    public static ArrayList<Integer> topKFreq(int[] arr, int k) {
        HashMap<Integer , Integer> ans = new HashMap<>();
         for (int ele : arr) {
            ans.put(ele, ans.getOrDefault(ele, 0) + 1);

         };

             PriorityQueue<Pair> pq = new PriorityQueue<>();
             for (int ele : ans.keySet()){
                  int freq = ans.get(ele);
                  pq.add(new Pair(ele , freq));
                  if (pq.size()> k) pq.remove();

             }
             ArrayList<Integer> an = new ArrayList<>();
             while (pq.size() > 0){
                 Pair top = pq.remove();
                 an.add(top.ele);
             }
        Collections.reverse(an);
             return an ;

    }
}




public class TopKfrequentelements {
    public static void main(String[] args) {
        int[]  arr = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        int k = 4 ;

        Solution1.topKFreq(arr , k);


    }
}