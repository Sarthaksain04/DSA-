package CollectionFrameWork.List.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLength implements Comparator<String>{
      @Override
    public int compare(String o1 , String o2){
          return o1.length() - o2.length() ;
      }
}

//  s1   s2
// "ok" "Bye"

class StringLength2 implements Comparator<String>{
    @Override
    public int compare(String o1 , String o2){
        return o2.length() - o1.length() ;
    }
}


public class Sortacctolengthofstring {
    public static void main(String[] args) {


        List<String> words = Arrays.asList("Banana" , "apple" , "date");
        words.sort(new StringLength());
        System.out.println(words);

        words.sort(new StringLength2());
        System.out.println(words);

    }
}
