package CollectionFrameWork.List.ArrayList.Questions;

import java.util.ArrayList;

public class GetCommonElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(6);

        for (int i = 0; i < list.size() ; i++) {
            for (int j = i + 1; j < list.size(); j++) {
            if (list.get(i).equals(list.get(j))) {
               list2.add(list.get(i));
                System.out.println(list2);
            }
        }
        }

    }
}
