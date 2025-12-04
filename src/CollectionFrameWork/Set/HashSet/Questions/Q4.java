package CollectionFrameWork.Set.HashSet.Questions;

import java.util.HashSet;

public class Q4 {
    public static void main(String[] args) {
        HashSet<Integer> Set  = new HashSet<>();
        Set.add(1);
        Set.add(2);
        Set.add(3);
        Set.add(4);
        Set.add(5);
        System.out.println(Set);
        Set.remove(3);
        System.out.println(Set);

    }
}
