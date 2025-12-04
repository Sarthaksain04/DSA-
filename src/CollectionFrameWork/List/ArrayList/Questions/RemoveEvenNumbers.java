package CollectionFrameWork.List.ArrayList.Questions;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(14);
        list.add(13);
        list.add(24);
        list.add(23);
        list.add(17);
        Iterator<Integer> lis =  list.iterator();
              while (lis.hasNext()){
                   int num = lis.next();
                   if (num % 2 == 0){
                       lis.remove();
                   }
              }
        System.out.println(list);
    }
}
