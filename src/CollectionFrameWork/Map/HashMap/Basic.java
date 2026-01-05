package CollectionFrameWork.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Basic {

    public static void HashMapMethods(){
        Map<String , Integer> mp = new HashMap<>();
        mp.put("Akash" ,21); // Adding element
        mp.put("Yash" , 16);
        mp.put("Lav" , 17);
        mp.put("Ritika" , 19);
        mp.put("Harry" , 18);

        // Getting value of a key from the HashMap
        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("Rahul")); // null

        // Changing value of a key in the HashMap
        mp.put("Akash" , 25) ;  // Akash --> 25
        System.out.println(mp.get("Akash")); // 25

        // Removing a pair from the HashMap
        System.out.println(mp.remove("Akash")); // 25
        System.out.println(mp.remove("riya")); //  null it doesn't exist

        //Checking if a key is in the hashMap
        System.out.println(mp.containsKey("Akash")); // it already remove it gives false
        System.out.println(mp.containsKey("Yash")); // true

        // Adding a new entry only if the new key doesn't exist already
        if (!mp.containsKey("Yash")) mp.put("Yash" , 30 ); // Method 1
        mp.putIfAbsent("Yashika" , 30 ); // Method 2
        mp.putIfAbsent("Yash" , 30 ); // will not enter it alreay present in it

        // Get all keys in HashMap
        System.out.println(mp.keySet());

        // Get all values in HashMap
        System.out.println(mp.values());

        // Get all entries in the hashMap
        System.out.println(mp.entrySet());

        // This is for the value is not present
        mp.putIfAbsent("Yash" , 0);

        // This is for the value is present
        mp.putIfAbsent("Naruto" , 50);

        // If the value is present we get the value if not it return the default value
        Integer res = mp.getOrDefault("All might" , 21);
        System.out.println(res);

        // Traversing all entries of HashMap - Multiple methods
        for (String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n" , key, mp.get(key));
        }
        System.out.println();
        for (Map.Entry<String , Integer> e  : mp.entrySet()){
            System.out.printf("Age of %s is %d\n" , e.getKey() , e.getValue());
        }
        System.out.println();
        for (var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n" , e.getKey() , e.getValue());

        }


    }


    public static void main(String[] args) {
           HashMapMethods();
    }
}
