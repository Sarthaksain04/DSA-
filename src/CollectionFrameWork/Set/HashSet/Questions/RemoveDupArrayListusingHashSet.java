package CollectionFrameWork.Set.HashSet.Questions;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDupArrayListusingHashSet {
    public static void main(String[] args) {
        ArrayList<Integer> Set = new ArrayList<>();
        Set.add(1);
        Set.add(1);
        Set.add(2);
        Set.add(1);
        Set.add(3);
        Set.add(4);
        Set.add(5);
        Set.add(5);

        HashSet<Integer> set = new HashSet<>(Set);
        System.out.println(set);



    }
}
