package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

//               Defination
//        (A Stream is a sequence of elements
//        from a collection that lets you
//        process data functionally (filter, map, reduce)
//        without modifying the original collection.)


//        Features

//        Feature Introduced in Java 8
//        Process Collections(List , Map , Queue and other collection ) of Data in a functional and declarative manner
//        When We didn't have Stream then we have to used loop and we use if - else
//        so the code became to big and it decreases readability and there is an chance of error
//        because our code is too big to catch the bug so to simplify  Data Processing it stream came in to existence
//        Improve Readability and Maintainability
//        Enable Easy Parallelism --> it skip the problem of MultiThreading complexity


//        What is Stream ?
//        a sequence of elements supporting functional and Declarative programming
//        Converting any  collection into the Stream to Perform functional and Declarative Programming  on it


//        How to Use Streams ?
//        Source , intermediate  Operation & terminal Operation



        List<Integer> numbers = Arrays.asList(1 , 2 , 3, 4, 5);
//      Let's solve an Question - even number find
        int count = 0 ;
        for (int i : numbers ){
            if (i % 2 == 0){
                count++;
            }

        }
        System.out.println(count); // This is the traditional Way To solve

        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());  // By the Help of  Streams
        // By Contradicting the Streams Defination here
        //numbers ---> Source , filter ---> Intermediate Function ,  count ---> Terminal Operation


//   Creating Streams

//      1. From Collections
             List<Integer> list =  Arrays.asList(1 , 2 , 3 , 4, 5);
             Stream<Integer> stream = list.stream();

//      2. From Arrays
              String[] array = {"a" , "b" , "c"};
              Stream<String> stream2 = Arrays.stream(array);

//      3. Using Stream.of() -> Direct method
              Stream<String> stream3 = Stream.of("a", "b", "c", " d");

//      4. Infinite Stream
             Stream<Integer> genrate  = Stream.generate(()-> 1); // If you want stream with only one it can generate Infinite  Stream of 1

             List<Integer>   collect  = Stream.iterate(0 , x -> x + 1).limit(20).collect(Collectors.toList()); // One more way to make an Infinite Stream Seed = Starting Point
             System.out.println(collect);

             Stream<Integer> genrate1 = Stream.generate(()-> 1).limit(100); // If you want stream With limit


    }

}
