package CollectionFrameWork.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class BasicAccessOrder {
    public static void main(String[] args) {
        // access order - in this when we access any element it goes to the last of the HashMap and access order - is always ( true )
            LinkedHashMap<String , Integer> linkedHashMap = new LinkedHashMap<>(11 , 0.3f ,true);
            linkedHashMap.put("Orange" , 10 );
            linkedHashMap.put("Apple" , 20);
            linkedHashMap.put("Guava" , 13);
            // output -  Orange: 10  , Apple: 20 , Guava: 13

            linkedHashMap.get("Apple");
            //after getting it the entry moves to the end of the map
           // output -  Orange: 10  , Guava: 13 ,  Apple: 20

            for (Map.Entry<String , Integer> entry : linkedHashMap.entrySet()){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

