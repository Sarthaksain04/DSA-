package CollectionFrameWork.Map.HashMap;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        // Array of Size same as enum
        // no hashing
        // ordinal / index is Used
        // Faster Than HashMap
        // Memory Efficient
        Map<Day, String> map= new EnumMap<>(Day.class);
        map.put(Day.Tuesday , "Gym");
        map.put(Day.Monday , "Walk");
        System.out.println(map);
    }
}

enum Day{
     Monday , Tuesday , Wednesday , Thrusday , Friday , Saturday , Sunday
}
