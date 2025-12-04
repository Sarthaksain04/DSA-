package CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        // "Copy  on Write " means that Whenever a write Operation
        // like adding or removing an element
        // Instead Of directly modifying the existing list
        // a  new Copy of the List is created , and the Modification is applied to that copy
        // This ensures that other threads reading the list while it's being modified are unaffected.

        // Read Operations: Fast and direct, since they happen on a stable list without interference fron modifications.
        // Write Operations: A new copy of the list is created for every modification.
        //                   The reference to the list is then updated so that subsequent reads use this new list.

        //        notepad --> notepad-copy
        //        read more


        // This Gives Error Not thread safe
       //  List<String> shoppingList = new ArrayList<>();
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Rajma");
        shoppingList.add("Bread");
        System.out.println("Initial Shopping List: "+ shoppingList);

        for (String item : shoppingList){
            System.out.println(item);

            // Truy to modify the list while reading
            if (item.equals("Rajma")){
                shoppingList.add("Chawaal");
                System.out.println("Added Butter while reading...");
            }
        }
        System.out.println("udated Shopping List: " + shoppingList);
    }
}
