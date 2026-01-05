package CollectionFrameWork.Map.HashMap.Question;

// Given an array , find the most frequent element in it.
// if there are multiple elements that appear a maximum number of times, print any one of them
// n = 6
// arr[] = {1 , 3 , 2 , 1 , 4 , 1}

import java.util.HashMap;
import java.util.Map;

public class Ques {
    public static void main(String[] args) {
        int[] arr = {1 , 4 , 2 ,  5 , 1  , 4 , 4 , 6 , 4 , 4 ,  4 };
        Map<Integer , Integer> freq = new HashMap<>();
        for(int el : arr){
            if(!freq.containsKey(el)){
                freq.put(el , 1 );
            }
            else {
                freq.put(el, freq.get(el) + 1 );
            }
        }
        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());

        int maxFreq =0 , anskey = -1 ;
//        for (var e : freq.entrySet()){
//            if (e.getValue() > maxFreq){
//                maxFreq = e.getValue();
//                anskey  = e.getKey();
//            }


        for (var key : freq.keySet()){
            if (freq.get(key) > maxFreq){
                maxFreq = freq.get(key);
                anskey = key;
            }
        }
        System.out.printf("%d has max Frequency and it occurs %d times", anskey , maxFreq);
    }
}
