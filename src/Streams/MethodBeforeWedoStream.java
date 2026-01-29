package Streams;

import java.net.InterfaceAddress;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

interface sum{
       int operation(int a ,int b );
}
public class MethodBeforeWedoStream {
    public static void main(String[] args) {
        // Java 8 --> minimal code, Functional programming
        // Java 8 --> lambda expression, Streams, Date & Time API

        //lambda expressionn
        // lambda expression is an anonymous function (no name, no return type, no access modifiers)
         sum s =  (a , b) -> a + b ;
         int res = s.operation(1 , 3 );
         System.out.println(res);
         System.out.println();



         // Predicate --> Functional interface (boolean valued function)
        Predicate<Integer> isEven = x -> x % 2 == 0 ;
        System.out.println("even check:");
        System.out.println(isEven.test(4));
        System.out.println();
        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithT = x -> x.toLowerCase().endsWith("t");
        Predicate<String> and = isWordStartingWithA.and(isWordEndingWithT);
        System.out.println(isWordStartingWithA.test("Aam"));
        System.out.println();


        //Function --> it do work
        Function<Integer , Integer>  doubleit = x -> 2 * x ;
        System.out.println("Double it :");
        System.out.println(doubleit.apply(100));

        Function<Integer , Integer>  tripleit = x -> 3 * x ;
        System.out.println("Tripple it :");
        System.out.println(tripleit.apply(80));


        System.out.println();
        System.out.println("double then tripple :");
        System.out.println(doubleit.andThen(tripleit).apply(20));

        System.out.println();
        System.out.println("tripple Then Double :");
        System.out.println(doubleit.compose(tripleit).apply(20));

        Function<Integer, Integer> identity = Function.identity();// what you give it return the same
        int res2 = identity.apply(4);
        System.out.println(res2);


        // consumer -->  it take but naver gave them back
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(51);


        //supplier --> it gives
        System.out.println();
        System.out.println("Supply:");
        Supplier<String> give = () ->"Hello World";
        System.out.println(give.get());


        //UnaryOperator
        UnaryOperator<Integer> a = x -> 2 * x;
        //BinaryOperation
        BinaryOperator<Integer> b = (x , y) -> x  + y;
        b.apply(2,5);

//  Method reference --> use method without invoking & in place of lambda expression
//                                    OR

//  A method reference is a shorter and cleaner way to write a lambda expression when you are just calling an existing method.
        List<String>stud =  Arrays.asList("Ram " , "Shyam" , "Ghanshyam");
        System.out.println();
        System.out.println("Without Method reference :");
        stud.forEach(x -> System.out.println(x));

        System.out.println();
        System.out.println("With Method reference :");
        stud.forEach(System.out::println); // :: this is the method reference
        // we are giving the method as a parameter
        // Method reference is the Short Cut and it is shortest from lambda expression



        // Constructor reference  ----> this is just an small example not just proper implementation
        List<String> names = Arrays.asList("A" , "B" , "C");
       List<Mobile> listofmobilephone = names.stream().map(Mobile::new).collect(Collectors.toList());



  }
}



class Mobile{ // it is the example of Method reference
    String name ;

    public Mobile(String name) {
        this.name = name;
    }
}
