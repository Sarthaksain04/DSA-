package CollectionFrameWork.List.ArrayList.Questions;

import java.util.ArrayList;

public class CountFrequency {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(4);
        
        for (int i = 0 ;  i < list.size() ; i++){
            int count = 0 ;
            boolean Counted = false;
            for (int j = 0; j < i; j++) {
                if (list.get(i).equals(list.get(j))) {
                    Counted = true;
                    break;
                }
            }
            if (Counted) continue;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }

            System.out.println(list.get(i) + " occurs " + count + " times");


        }

    }
}
