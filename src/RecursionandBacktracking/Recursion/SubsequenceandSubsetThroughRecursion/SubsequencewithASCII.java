package RecursionandBacktracking.Recursion.SubsequenceandSubsetThroughRecursion;

import java.util.ArrayList;

public class SubsequencewithASCII {
    public static void main(String[] args) {
        System.out.println(seq("" , "abc"));
        sequenceAscii("" , "abc");
    }


    static void sequenceAscii(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        sequenceAscii(p + ch ,up.substring(1));
        sequenceAscii(p, up.substring(1));
        sequenceAscii(p +(ch - 0 ) , up.substring(1));
    }


    static ArrayList<String> seq(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return  list;
        }
        char ch = up.charAt(0);

        ArrayList<String> first =  seq(p + ch ,up.substring(1));
        ArrayList<String> second =  seq(p, up.substring(1));
        ArrayList<String> third = seq(p +(ch - 0) , up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
