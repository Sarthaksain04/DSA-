package CollectionFrameWork.List.LinkedLIst.Questions;

import java.util.HashSet;
import java.util.Iterator;

public class EvenRemove {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        Iterator<Integer> list = set.iterator();

        while(list.hasNext()){
             if (list.next() % 2 == 0){
                 list.remove();
                 System.out.println(list.next());
             }

        }
    }
}
