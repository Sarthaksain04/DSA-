package CollectionFrameWork.List.LinkedLIst.Questions;

import java.util.LinkedList;

public class InsertAtIndex {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Guava");
        System.out.println(list);
        list.add(2 , "Mango");
        System.out.println(list);
    }
}
