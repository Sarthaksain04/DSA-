package CollectionFrameWork.Map.SortedMap;

import Arrays.SlidingWindow.Types.FixedSizeWindow.Questions.FirstElementEachWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap< Integer , String> Map = new TreeMap<>((a , b) -> b - a  ); // at this point i used custom sorting logic so the operation are used gives the different result
//        Map<String , Integer> Map = new TreeMap<>();  // Here We can Also Put Map But We always suppose to Chosse the Sorted Map because it have some Good Method thats why we use SortedMap
        Map.put( 91 , "Vivek");
        Map.put( 99 , "Shubham");
        Map.put( 78 , "Mohit" );
        Map.put(77 , "Vipul");

        System.out.println(Map);
        Map.get(77);
        Map.containsKey(78);
        Map.containsValue("vipul");
        System.out.println(Map.firstKey());
        System.out.println(Map.lastKey());
        System.out.println(Map.headMap(91)); // it exclude the value 91
        System.out.println(Map.tailMap(91));
        System.out.println(Map.subMap(77 , 91));

    }
}
