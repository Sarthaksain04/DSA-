package CollectionFrameWork.Set.HashSet.Questions;

import java.util.ArrayList;
import java.util.HashSet;

public class Q6 {
    public static void main(String[] args) {
        HashSet<String> Set  = new HashSet<>();
        Set.add("Java");
        Set.add("Python");
        Set.add("C++");

        ArrayList<String> list = new ArrayList<>(Set);
        System.out.println(list);
    }
}
