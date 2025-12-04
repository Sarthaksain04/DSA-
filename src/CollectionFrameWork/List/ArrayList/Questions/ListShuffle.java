package CollectionFrameWork.List.ArrayList.Questions;

import java.util.ArrayList;
import java.util.Collections;

public class ListShuffle {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(6);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
