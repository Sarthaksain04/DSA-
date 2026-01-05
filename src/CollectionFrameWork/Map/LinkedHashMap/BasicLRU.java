package CollectionFrameWork.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class BasicLRU {
    public static void main(String[] args) {

        // LRU - Least Recently Used in this we find the least element which is recently used by using LinkedHashMap accessOrder
        // We know that  after getting it the entry moves to the end of the map so if the element is Access few times then the other it always appear's on the top

        LinkedHashMap<String , Integer> linkedHashMap = new LinkedHashMap<>(3 , 0.3f ,true);
        linkedHashMap.put("Orange" , 10 );
        linkedHashMap.put("Apple" , 20);
        linkedHashMap.put("Guava" , 13);
        // output -  Orange: 10  , Apple: 20 , Guava: 13

        linkedHashMap.get("Apple");
        linkedHashMap.get("Guava");
        linkedHashMap.get("Guava");
        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Apple");



        for (Map.Entry<String , Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
