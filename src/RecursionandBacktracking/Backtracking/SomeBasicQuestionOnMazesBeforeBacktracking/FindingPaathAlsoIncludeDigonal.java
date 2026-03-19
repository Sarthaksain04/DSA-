package RecursionandBacktracking.Backtracking.SomeBasicQuestionOnMazesBeforeBacktracking;

import java.util.ArrayList;

public class FindingPaathAlsoIncludeDigonal {
    public static void main(String[] args) {
        System.out.println(patheithDigonal("" , 3 , 3 ));

    }
    static ArrayList<String> patheithDigonal(String p , int r , int c){
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1){
            list.addAll(patheithDigonal(p + 'D' , r -1 , c - 1));
        }

        if (r > 1){
            list.addAll(patheithDigonal(p + 'V' , r -1 , c));
        }
        if (c > 1){
            list.addAll(patheithDigonal(p + 'H' , r , c - 1));
        }
        return list;
    }
}
