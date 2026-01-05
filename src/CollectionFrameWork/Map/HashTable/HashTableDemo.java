package CollectionFrameWork.Map.HashTable;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer , String > hashtable = new Hashtable<>();
        // HashTable is synchronized
        // No null key or Value
        // Legacy Class, ConcurrentHashMap
        // slower than HashMap
        // Only linked list in case of Collision
        // All method  are Synchronized
        hashtable.put(1 , "Apple");
        hashtable.put(2 , " Banana");
        hashtable.put(3 , "Cherry");
        System.out.println(hashtable);

        System.out.println("Value for key 2 :" + hashtable.get(2));
        System.out.println("Does key 3 exist? " + hashtable.containsKey(3));
        hashtable.remove(1);
        System.out.println("after removing key 1: " + hashtable);
        //   hashTable.put(null , "Value" ) ; // Throws Exception
        //   hashTable.put(4 , null ) ; Throws exception
    }
}
