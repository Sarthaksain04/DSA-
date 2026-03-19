package RecursionandBacktracking.Recursion.Assesment1;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(print(s , 0 , new ArrayList<>()));


//        int[] arr = {1 , 2 , 3 , 4 , 5};
//        print(arr , 0);

    }
//    static void arr(char[] s , int i){
//          if (s.length  == 0){
//              return ;
//          }
//
//        arr(s , s.length -1);
//        System.out.println(Arrays.toString(s));
//
//    }


    static ArrayList<Character> print(char[] s , int i  , ArrayList<Character> l){
           if (s.length  == i){
               return l ;
           }

        print(s, i + 1 , l);
           l.add(s[i]);

           return l;


    }
}
