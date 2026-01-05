package CollectionFrameWork.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

// Whatever you did If you get or Put The thing which is used or insert  long time ago is The Least recently Used item
// When the cache reaches capacity, it removes the least recently used item before inserting a new one.
public class LRUCache<K , V> extends LinkedHashMap<K , V> {

private int capacity;
    public LRUCache(int capacity){
        super(capacity , 0.75f , true);
        this.capacity  = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String , Integer>students = new LRUCache<>(3);
        students.put("Sarthak" , 99);
        students.put("All Might" , 99);
        students.put("Deku" , 99);
        students.get("Sarthak");
        students.put("Luffy" , 99);
        System.out.println(students);

    }
}
