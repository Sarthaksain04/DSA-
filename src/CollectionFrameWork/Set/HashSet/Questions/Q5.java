package CollectionFrameWork.Set.HashSet.Questions;

import java.util.HashSet;

public class Q5 {
    public static void main(String[] args) {
        HashSet<Integer> Set  = new HashSet<>();
        Set.add(1);
        Set.add(2);
        Set.add(3);
        Set.add(4);
        Set.add(5);

        for (int x : Set){
            System.out.print(x + " ");
        }
    }
}
