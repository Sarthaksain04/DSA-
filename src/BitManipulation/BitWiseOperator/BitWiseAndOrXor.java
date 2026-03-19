package BitManipulation.BitWiseOperator;

public class BitWiseAndOrXor {
    public static void main(String[] args) {

//1)   AND (&) Operator = In AND Operator whenever there is 0 it always gives 0 Or You can understand like this that 0 is PowerFull in And
        // 0 & x = 0       here x = 0 ,1
        // What And Works ? Ans = it always use to Off Something
        System.out.println(51&42);

//2)   OR  (|) Operator = In Or Operator whenever there is 1 it always gives 1 Or You can understand like this that 1 is PowerFul in OR
        // 1 | x = 1       here x = 0 ,1
        //  What OR Works ? Ans = it always use to On Something
        System.out.println(51|42);

//3)   XOR (^) Operator = In XOR Operator Whenever there is Alternating it will always give 1 and if there is same same it will always give 0
       // 1 ^ 1 = 0  , 1 ^ 0  = 1  , 0 ^ 0 = 0  , a ^ a = 0
        System.out.println(51^42);


//     1s Complement = In this we just simple Flip the bits of number of a GIven number
       int X = 3 ;
        System.out.println(~X);

//5)   2s Complement = In this we just simple flip and add + 1 in the bits of a number
       int x = 5;
        System.out.println(~x+1); // Both are same
        System.out.println(-x);  // also 2s complement



    }
}
