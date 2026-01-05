package CollectionFrameWork.List.ArrayList.Questions;

import java.util.ArrayList;

public class PairSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int target = 5 ;
        for (int i = 0; i < arr.size() ; i++) {
            for (int j = 0; j < arr.size() ; j++) {
                if (arr.get(i) + arr.get(j) == target  ){
                    System.out.println("(" + arr.get(i) +", " + arr.get(j) +")" );
                }
            }
        }

    }
}
