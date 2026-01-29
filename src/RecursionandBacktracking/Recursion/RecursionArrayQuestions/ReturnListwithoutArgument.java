package RecursionandBacktracking.Recursion.RecursionArrayQuestions;

import java.util.ArrayList;
// not effecient way

public class ReturnListwithoutArgument {
    public static void main(String[] args) {
        int[]arr = {1 , 2, 3, 4, 4 , 8};
        System.out.println(findAllIndex2(arr , 4 , 0 ));

    }


    static ArrayList<Integer> findAllIndex2(int[]arr , int target , int index ){
        ArrayList<Integer>list1 = new ArrayList<>();
        if (index == arr.length){
            return list1;
        }
        // this will contain answer for that function call only
        if (arr[index] == target){
            list1.add(index);
        }
        ArrayList<Integer> ans =  findAllIndex2(arr, target , index  + 1);
        list1.addAll(ans);

        return list1 ;
    }
}
