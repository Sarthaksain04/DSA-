package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1 , 2 , 3);

        //1. Collect --> Converts the stream into a collection or another result (List, Set, Map, etc.).
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        //2. for each -->  Performs an action on each element of the stream.
        list.stream().forEach(x -> System.out.println(x));
                       // Or
        list.stream().forEach(System.out::println);




        //3. reduce : Combine elements to produce a single result
              System.out.println(list.stream().reduce(Integer::sum));
                               // Or
              Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
              System.out.println(optionalInteger.get());

        //4. Count -→ Returns the total number of elements in the stream.
        System.out.println("count :");
              System.out.println(list.stream().count());


        // 5. anyMatch , allMatch , None Match
          // anyMatch -->  Returns true if any element matches the given condition.
              boolean b = list.stream().anyMatch(x -> x % 2 ==0);
              System.out.println(b);
         // allMatch  -->  Returns true if all elements match the given condition.
              boolean b1 = list.stream().allMatch(x -> x > 0);
              System.out.println(b1);
         // None Match --> Returns true if no elements match the given condition.
              boolean b2 = list.stream().noneMatch(x -> x < 0);
              System.out.println(b2);



        // 6. findFirst , FindAny
          //  findFirst --> Returns the first element of the stream, if present.
              System.out.println(list.stream().findFirst().get());
          //  FindAny   --> Returns any element from the stream (useful for parallel streams).
              System.out.println(list.stream().findAny().get());

        //      7. toArray()
              Object[] array = Stream.of(1  , 2 ,3).toArray();

        //      8. min  / max
              System.out.println("max : "+Stream.of(2 , 44  , 69).max(Comparator.naturalOrder()).get());
              System.out.println("min : "+Stream.of(2 , 44  , 69).min(Comparator.naturalOrder()).get());

              // 9. foreachordered

             List<Integer> num = Arrays.asList(1 , 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10);
             System.out.println("Using forEachOrdered with parallel stream");
              num.parallelStream().forEachOrdered(System.out::println);


              //Examples: Filtering and Collecting Names
              List<String> names = Arrays.asList("Anna" , "Bob" , "Charlie" , "Daiv");
              System.out.println(names.stream().filter(x -> x.length() > 3).toList());

              // Example: Squaring and Sorting Numbers
              List<Integer> numbers = Arrays.asList(5 , 2 , 9 , 1 , 6);
              System.out.println(numbers.stream().map(x -> x * x ).sorted().toList());

              // Example: Summing Values
              List<Integer> integers = Arrays.asList(1 , 2 ,  3 , 4 , 5);
              System.out.println(integers.stream().reduce(Integer :: sum).get());

              // Example: Counting Occurance of a Character
              String sentence = "Hello world";
              System.out.println(sentence.chars().filter(x -> x == 'l').count());

              // Example:
        // streams cannot be resued  after a terminal operation has been called
              Stream<String> strm = names.stream();
              strm.forEach(System.out::println);
//              strm.map(String::toUpperCase).toList();
              //  stateful & Stateless


    }
}
