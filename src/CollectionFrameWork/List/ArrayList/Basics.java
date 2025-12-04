package CollectionFrameWork.List.ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(1);   // Method 1 : Add element in list
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(9 , 10 ); // Method 2 : Add element Through Index
        System.out.println(list); // print list
        System.out.println();
        System.out.println("helps to add all element : ");
        list2.add(11);
        list2.add(12);
        list2.add(14);
        list2.add(13);
        list.addAll(list2); // add all element in another list
        System.out.println(list);
        System.out.println();
        System.out.println("Retrieve element from index : 3");
        System.out.println("Get : " + list.get(3)); // Mehtod 3 : retrieve the element from list and index starts from 0
        System.out.println();
        System.out.println("Replace : 12 at index : 1 ");
        list.set(0 , 12); // method 4 : replace Or modify the element fromm list
        System.out.println(list);
        System.out.println();
        System.out.println("Remove an Element through index 1  :");
        list.remove(1); // method 5 : remove element through  index
        System.out.println(list);
        System.out.println();
        System.out.println("Remove an Element through its actual value 4   :");
        list.remove(Integer.valueOf(4)); // method 6 : remove element through  its actual value
        System.out.println(list);
        System.out.println();
        System.out.println("It tells the index of the lement here i asks the index pf 3 :");
        System.out.println("index : " +list.indexOf(3)); // method 7 : it tells the Index of element
        System.out.println();
        System.out.println("it tells the size of List:");
        System.out.println("size : " + list.size()); // method 8 : it tells the Size of an list
        System.out.println();
        System.out.println("it helps to find an element :");
        System.out.println("Contains : " + list.contains(3)); // method 9 : search the element
        System.out.println();
        System.out.println("it clear the list");
        list.clear(); // method 10 it clears the list
        System.out.println(list);
        System.out.println();
        System.out.println("it tells that list is empty or not");
        System.out.println(list.isEmpty()); // method 11 it tell that list is eampty or not
        System.out.println();
        System.out.println("Sort the List: "); // method 12 : sort the element of the list
        Collections.sort(list2); // sort the list
        System.out.println(list2);
        System.out.println();
        System.out.println("Reverse the List :");
        Collections.reverse(list2); // Methid 13 : Reverse the List
        System.out.println(list2);
        System.out.println();
        System.out.println("Check the Object is equal :");
        System.out.println(list2.equals(list)); // Method 14 : Check the Object is Equal or not
        System.out.println();
        System.out.println("Find the Last Index of the Object :");
        System.out.println(list2.lastIndexOf(12)); // Method 15 : it tells the Index of element from last
        System.out.println();
        System.out.println("It returns the part of the list :");
        System.out.println(list2.subList(0 , 3)); // Method 16 : In this We can return the subset from the List
        System.out.println();





    }
}
