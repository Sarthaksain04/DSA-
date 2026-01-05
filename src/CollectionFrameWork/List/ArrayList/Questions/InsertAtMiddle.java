package CollectionFrameWork.List.ArrayList.Questions;

import java.util.ArrayList;
import java.util.List;


public class InsertAtMiddle {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        System.out.println(arr);
        int mid = arr.size() / 2 ;
        System.out.println("the mid : "+ mid);
            arr.add(mid , 7);
            arr.add(mid , 9 );
        System.out.println(arr);
        System.out.println(arr.get(2));




    }
}
