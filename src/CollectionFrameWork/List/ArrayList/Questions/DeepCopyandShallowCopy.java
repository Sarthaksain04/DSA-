package CollectionFrameWork.List.ArrayList.Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DeepCopyandShallowCopy {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        // SHALLOW COPY using clone()

        ArrayList<String> shallowCopy = (ArrayList<String>) list1.clone();

        // DEEP COPY using loop
        ArrayList<String> deepCopy = new ArrayList<>();

        for (String val : list1){
            deepCopy.add(val);
        }
        System.out.println("Original List: " + list1);
        System.out.println("Shallow Copy : " + shallowCopy);
        System.out.println("Deep Copy    : " + deepCopy);
    }
}
