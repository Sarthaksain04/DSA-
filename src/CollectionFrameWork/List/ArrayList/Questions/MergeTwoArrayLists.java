package CollectionFrameWork.List.ArrayList.Questions;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        list2.add("B");
        list2.add("D");
        list2.add("E");
        System.out.println(list2);

        list.addAll(list2);
        System.out.println(list);

        for (int i = 0; i <list.size() ; i++) {
            boolean isSame = false;

            for (int j = i + 1 ; j < list.size() ; j++) {
                 if (list.get(i).equals(list.get(j))){
                     isSame = true ;
                     break;
                 }
            }
            if (!isSame){
                list3.add(list.get(i));
                Collections.sort(list3);
                System.out.println(list3);
            }
        }

    }
}
