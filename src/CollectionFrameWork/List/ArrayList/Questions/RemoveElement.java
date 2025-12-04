package CollectionFrameWork.List.ArrayList.Questions;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("c++");
        list.add("Flutter");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
        System.out.println();
        list.remove("c++");
        System.out.println(list);
    }
}
