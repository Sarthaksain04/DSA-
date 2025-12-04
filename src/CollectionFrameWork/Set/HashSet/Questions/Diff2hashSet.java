package CollectionFrameWork.Set.HashSet.Questions;

import java.util.HashSet;

public class Diff2hashSet {
    public static void main(String[] args) {
        HashSet<Integer>Set1  = new HashSet<>();
        HashSet<Integer>Set2 = new HashSet<>();

        Set1.add(1);
        Set1.add(2);
        Set1.add(3);
        Set1.add(4);

        Set2.add(3);
        Set2.add(4);
        Set2.add(5);
        Set2.add(6);

        // Method 1: Using removeAll()

        HashSet<Integer> Diff = new HashSet<>(Set1);

        Diff.removeAll(Set2);
        System.out.println(Diff);

        // Method 2: Manual Loop (Interview logic)

        HashSet<Integer> Diffrent = new HashSet<>();
        for (Integer num : Set1){
            if (!Set2.contains(num)){
                Diffrent.add(num);
            }
        }
        System.out.println(Diffrent);


    }
}
