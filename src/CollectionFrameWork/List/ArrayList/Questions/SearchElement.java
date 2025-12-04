package CollectionFrameWork.List.ArrayList.Questions;

import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("c++");
        list.add("Flutter");
        System.out.println(list);
        if (list.contains("Java")){
            System.out.println("It contains java");

        }else{
            System.out.println("It not have java");
        }


    }
}
