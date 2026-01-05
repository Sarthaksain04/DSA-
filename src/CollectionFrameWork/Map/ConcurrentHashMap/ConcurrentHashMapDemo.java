package CollectionFrameWork.Map.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentMap<String , Integer> map = new ConcurrentHashMap<>();

        // Java  7  --> segment based Locking --> 16 segments --> smaller hashMaps
        // Only the segments being written to or read from is locked
       //  read do not required locking unless there is a write operation happening on the same segment
        // write: lock


        // java8 --> no segmentation
        //  ---> Compare-And-Swap approach --> no locking except resizing or Collection
        // Thread A  last saw --> x = 45
        // Thread A Work --> x to 50
        // if x is still 45, then change it to 50 else don't change and retry

       // ex through HashMap
        // put --> index
    }
}
