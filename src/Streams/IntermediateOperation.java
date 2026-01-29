package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperation {
    public static void main(String[] args) {
//        Intermediate Operations transform a stream into another stream
//        They are lazy , meaning they don't execute until a terminal opeartion is invoked

//        1. filter -→ Selects elements that match a given condition.
          List<String> list = Arrays.asList("Ankit" , "Ram" , "Shyam" , "Ghanshyam" , "Ankit");
          Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
//        no filtering at this point until u didn't use Terminal Operation


          long res  = list.stream().filter(x -> x.startsWith("A")).count();
          System.out.println(res);



//        2. map -→ Transforms each element into another form.
          Stream<String> stringStream = list.stream().map(String::toUpperCase);
          stringStream.forEach(System.out::println);


//      3. sort ->  Sorted on Natural Ordering
        Stream<String> sorted = list.stream().sorted();
        System.out.println();
        sorted.forEach(System.out::println);

        Stream<String> sortedusingcomparitor = list.stream().sorted((a, b) -> a.length() - b.length());
        System.out.println();
        sortedusingcomparitor.forEach(System.out::println);
        System.out.println();


//      4.Distinct --> Removes duplicate elements from the stream.
        System.out.println(list.stream().filter(x ->x.startsWith("A")).distinct().count());
        System.out.println();

        //5.  Limit -→ Restricts the stream to a fixed number of elements
        System.out.println(Stream.iterate(1 , x -> x + 1 ).limit(30).collect(Collectors.toList()));

//      6. skip -→ Skips a specified number of initial elements.
        System.out.println(Stream.iterate(1 , x -> x + 1 ).skip(10).limit(30).count());

        // 7. peek
        // performs an action on each element as it is consumed
        Stream.iterate(1 , x-> x +1).skip(10).limit(100).peek(System.out::println).count();

        // 8. flatMap
        // Handle streams of Collections , list  , or arrays where each element is itself a collection
        // Flattern nested structures (e.g.. lists withib lists ) so that they can be processed as a single sequence of elements
        // Transformm and flattern elements at the same time.

//        List<List<String>> list4 = new ArrayList<>(); // 1.
//
//        List<String> l = new ArrayList<>();
//        l.add("Sarthak");
//        l.add("Sam");
//
//        List<String> l2 = new ArrayList<>();
//        l2.add("Thor");
//        l2.add("Harry");
//
//        list4.add(l);
//        list4.add(l2);
//        System.out.println(list4);
//        System.out.println(list4.get(1).get(0));

// 2 Way

        List<List<String>> list5 = Arrays.asList(
                Arrays.asList("apple" , "banana"),
                Arrays.asList("orange" , "Kiwi"),
                Arrays.asList("peer" , "grapes")
        );

        System.out.println(list5);
        System.out.println(list5.get(1).get(1));
        System.out.println(list5.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());


        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful ",
                "flatmap is useful"
        );
        System.out.println(sentences.stream().flatMap(sentence-> Arrays.stream(sentence.split(" "))).map(String::toUpperCase).toList());


    }
}
