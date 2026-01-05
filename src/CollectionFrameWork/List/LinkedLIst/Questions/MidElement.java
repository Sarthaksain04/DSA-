package CollectionFrameWork.List.LinkedLIst.Questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class MidElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int mid = list.size() / 2 ;
        System.out.println(list.get(mid));


    }
}
