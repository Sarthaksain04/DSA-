package CollectionFrameWork.List.LinkedLIst.Questions;

import java.util.LinkedList;

public class RetriveElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Guava");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
