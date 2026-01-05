package CollectionFrameWork.Map.ConcurrentSkipListMap;

import CollectionFrameWork.Map.ConcurrentHashMap.ConcurrentHashMapDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String , Integer > map = new ConcurrentSkipListMap<>();
        map.put("Apple" , 2 );
        map.put( "C" , 3 );
        map.put( "A" , 4 );
        map.put( "B" , 5 );


    }
}
