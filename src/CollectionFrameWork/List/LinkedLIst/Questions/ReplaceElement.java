package CollectionFrameWork.List.LinkedLIst.Questions;

import java.util.LinkedList;

public class ReplaceElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Guava");
        System.out.println(list);

        for(String x : list){
            System.out.print(x.toUpperCase()+" ");
        }


    }
}
