package CollectionFrameWork.List.ArrayList.Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Stringlength implements Comparator<String>{
    @Override
    public int compare(String o1 , String o2){
           return o1.length() - o2.length() ;
    }

}

public class CustomSortingStringlength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Banana" , "apple" , "date");
        words.sort(new Stringlength());
        System.out.println(words);

    }
}
