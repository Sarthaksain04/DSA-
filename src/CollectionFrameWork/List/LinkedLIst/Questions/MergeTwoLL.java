package CollectionFrameWork.List.LinkedLIst.Questions;

import java.util.LinkedList;
import java.util.Set;

public class MergeTwoLL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println(list2);

        LinkedList<Integer> merged = new LinkedList<>();

        // Add unique from first list
        for (int num : list) {
            if (!merged.contains(num)) {
                merged.add(num);
            }
        }

        // Add unique from second list
        for (int num : list2) {
            if (!merged.contains(num)) {
                merged.add(num);
            }
        }

        System.out.println("Merged (unique, no common duplicates): " + merged);



    }
}
