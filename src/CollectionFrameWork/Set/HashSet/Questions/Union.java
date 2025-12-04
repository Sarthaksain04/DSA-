package CollectionFrameWork.Set.HashSet.Questions;

import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        HashSet<Integer> Set1 = new HashSet<>();
        HashSet<Integer> Set2 = new HashSet<>();
        Set1.add(1);
        Set1.add(2);
        Set1.add(3);

        Set2.add(3);
        Set2.add(4);
        Set2.add(5);

        Set1.addAll(Set2);
        System.out.println(Set1);
    }
}
