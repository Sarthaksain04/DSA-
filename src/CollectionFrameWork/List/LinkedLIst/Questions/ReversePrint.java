package CollectionFrameWork.List.LinkedLIst.Questions;

import java.util.Iterator;
import java.util.LinkedList;

public class ReversePrint {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Guava");
        System.out.println(list);
        Iterator<String> l = list.descendingIterator();
        while (l.hasNext()){
            System.out.print("["+l.next()+"]");
        }


    }
}
