package CollectionFrameWork.List.ArrayList.Questions;

import java.util.ArrayList;
import java.util.Collections;

public class FindMaximumandMinimum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println("Maximum:" +  Collections.max(list));
        System.out.println("Minimum :" + Collections.min(list));

    }
}
