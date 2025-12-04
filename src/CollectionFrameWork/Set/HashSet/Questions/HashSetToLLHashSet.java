package CollectionFrameWork.Set.HashSet.Questions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class HashSetToLLHashSet {
    public static void main(String[] args) {
        HashSet<Integer> Set = new HashSet<>();
        Set.add(1);
        Set.add(2);
        Set.add(3);
        Set.add(4);
        Set.add(5);

        LinkedHashSet<Integer> LL = new LinkedHashSet<>(Set);
        System.out.println(LL);
    }
}
