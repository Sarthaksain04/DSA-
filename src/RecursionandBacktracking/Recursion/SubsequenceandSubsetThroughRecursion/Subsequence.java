package RecursionandBacktracking.Recursion.SubsequenceandSubsetThroughRecursion;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        sequence("" , "abc");
        System.out.println(seq("" , "abc"));
    }

    static void sequence(String p , String up){
           if (up.isEmpty()){
               System.out.println(p);
               return;
            }
            char ch = up.charAt(0);

           sequence(p + ch ,up.substring(1));
           sequence(p, up.substring(1));
    }
    
     

    static ArrayList<String> seq(String p , String up){
        if (up.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return  list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left =  seq(p + ch ,up.substring(1));
        ArrayList<String> right =  seq(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
