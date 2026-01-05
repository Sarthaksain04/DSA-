package CollectionFrameWork.List.LinkedLIst.Questions;

import java.util.LinkedList;

public class ContainsLL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Guava");
        System.out.println(list);
        if (list.contains("Apple")){
            System.out.println("Found");
        }
        else {
            System.out.println("!Not Found");
        }

    }
}
