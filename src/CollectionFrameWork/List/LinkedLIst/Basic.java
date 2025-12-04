package CollectionFrameWork.List.LinkedLIst;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();
        System.out.println("1 . adding element:");
        list.add(4); // 1 add element
        list.add(2);
        list.add(1);
        list.add(3);
        System.out.println(list);
        System.out.println();
        System.out.println("2 . Adding element through index 3 at 0 index");
        list.add(0 , 3);
        System.out.println(list);
        System.out.println();
        System.out.println("3. Adding element at first : 0");
        list.addFirst(0);
        System.out.println(list);
        System.out.println();
        System.out.println("4. Adding element at last : 5");
        list.addLast(5);
        System.out.println(list);
        System.out.println();
        System.out.println("5 . get the element ");
        System.out.println("get: " +list.get(2));
        System.out.println();
        System.out.println("6 . Get first element");
        System.out.println(list.getFirst());
        System.out.println();
        System.out.println("7 . Get last element");
        System.out.println(list.getLast());
        System.out.println();
        System.out.println("8 . Set  element 4 at index 2");
        list.set(2 , 4);
        System.out.println(list);
        System.out.println();
        System.out.println("9 . remove first element: ");
        list.remove();
        System.out.println(list);
        System.out.println();
        System.out.println("10 . remove element from index");
        list.remove(3);
        System.out.println(list);
        System.out.println();
        System.out.println("11 . Remove First element");
        list.removeFirst();
        System.out.println(list);
        System.out.println();
        System.out.println("12 . Remove Lastt element");
        list.removeLast();
        System.out.println(list);
        System.out.println();
        System.out.println("13 . It gives size of an list");
        System.out.println(list.size());
        System.out.println();
        System.out.println("14 . Search elements");
        System.out.println(list.contains(2));
        System.out.println();
        System.out.println("15 . Clear element");
        list.clear();
        System.out.println(list);
        System.out.println();

//        list.removeif(x -> x % 2 == 0);
//        System.out.println(list); so it remove an element with sondition

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat" , "Dog" , "Elephant"));
        System.out.println(animals);
        System.out.println("Remove an element Of animal to remove list from animals8");
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog" , "Lion"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);




    }
}
