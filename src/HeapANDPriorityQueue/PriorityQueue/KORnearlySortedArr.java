package HeapANDPriorityQueue.PriorityQueue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

public class KORnearlySortedArr {
    public static void main(String[] args) {
        int [] arr = {4 , 2 , 3 , 1 , 5};
        int k = 3 ;
        PriorityQueue<Integer> ans = new PriorityQueue<>();

        int idex = 0;

        for (int i : arr) {
            ans.add(i);

            if (ans.size() > k) arr[idex++] = ans.remove();
        }
        while (ans.size() > 0) arr[idex++] = ans.remove();
        System.out.println(Arrays.toString(arr));


    }
}
