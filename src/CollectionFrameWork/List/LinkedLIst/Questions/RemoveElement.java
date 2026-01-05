package CollectionFrameWork.List.LinkedLIst.Questions;

import java.util.LinkedList;

public class RemoveElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Guava");
        list.add("Mango");
        System.out.println(list);
        list.remove("Banana");
        System.out.println(list);
    }
}
