package RecursionandBacktracking.Recursion.Assesment1;

import java.util.Stack;

public class FirstUppercase {
    public static void main(String[] args) {
        String str= "geeksforgeeKs";
        System.out.println(First(str , 0));
    }

    static String First(String str , int i ){
           if(str.length() == i){
                   return  "";
           }
           if (Character.isUpperCase(str.charAt(i))){
               return String.valueOf(str.charAt(i));

           }
           return First(str , i + 1);
    }
}
