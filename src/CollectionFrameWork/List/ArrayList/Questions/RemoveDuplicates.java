package CollectionFrameWork.List.ArrayList.Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);

        List<Integer> unique = new ArrayList<>();

        for (int i = 0 ; i < list.size() ; i++) {
            Boolean isDuplicate = false ;
            for (int j = i + 1 ; j < list.size() ; j++) {
                if (list.get(i).equals(list.get(j))){
                       isDuplicate = true ;
                }
            }
            if(!isDuplicate){
                 unique.add(list.get(i));
                Collections.sort(unique);
                System.out.println(unique);
            }

        }
    }
}
