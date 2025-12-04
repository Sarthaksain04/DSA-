package CollectionFrameWork.List.Comparator;

import java.util.Arrays;
import java.util.List;

public class Sortthroughlambdaexpression {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana" , "apple" , "date");
        words.sort((a , b) -> b.length() - a.length()); // lambda expression
        System.out.println(words);

        words.sort((a , b) -> a.length() - b.length());
        System.out.println(words);

        words.sort(null);
        System.out.println(words);

    }}
