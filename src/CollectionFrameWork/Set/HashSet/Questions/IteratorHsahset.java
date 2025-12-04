package CollectionFrameWork.Set.HashSet.Questions;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorHsahset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        Iterator<Integer> list = set.iterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }
    }
}
