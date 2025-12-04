package CollectionFrameWork.Set.HashSet.Questions;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {
        HashSet<Integer> Set  = new HashSet<>();
        Set.add(1);
        Set.add(2);
        Set.add(3);
        Set.add(4);
        Set.add(5);
        System.out.println(Set.contains(3));

    }
}
