package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {

         // A type of Stream that enables parallel processing of elements
         // Allowing multiple threads to process parts of the stream simultaneously
        // this can significantly improve performance for large data sets
        // workload is distributed across multiple threads
        long starTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1 , x -> x + 1).limit(20000).toList();
        List <Long> f = list.stream().map(ParallelStream::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with stream: " + (endTime - starTime) + " ms");

        starTime = System.currentTimeMillis();
        f = list.parallelStream().map(ParallelStream::factorial).sequential().toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with prallelstream: " + (endTime - starTime) + " ms");
        // Parallel streams are most effective for CPU-intensive or large datasets where tasks are independent
        // They may add overhead for simple tasks or small datasets

        // Cumulative Sum
        // [1 , 2 , 3 , 4 , 5 ] --> [1 , 3 , 6 , 10 , 15]
        List<Integer> numbers = Arrays.asList(1 , 2 , 3 , 4, 5);
        AtomicInteger sum = new AtomicInteger(0) ;
        List<Integer> cumulativesum = numbers.parallelStream().map(x -> sum.addAndGet(x)).toList();
    }


    public static long factorial(int n){
        long result = 1 ;
        for (int i = 2; i <= n ; i++) {
            result *= i;
        }
        return result ;
    }
}
