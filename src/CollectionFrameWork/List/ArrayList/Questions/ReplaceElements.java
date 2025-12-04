package CollectionFrameWork.List.ArrayList.Questions;

import java.util.ArrayList;

public class ReplaceElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        for (int i = 0; i < list.size() ; i++) {
             int num = list.get(i);
             list2.add(num * num);
            System.out.println(list2);
        }
    }
}
