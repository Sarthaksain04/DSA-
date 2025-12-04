package CollectionFrameWork.Set.HashSet.Questions;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSet {
    public static void main(String[] args) {
        HashSet<Integer>Set = new HashSet<>();
        Set.add(1);
        Set.add(2);
        Set.add(3);
        Set.add(4);
        Set.add(5);
        Set.add(6);

        TreeSet<Integer> tree = new TreeSet<>(Set);
        System.out.println(tree);

    }
}
