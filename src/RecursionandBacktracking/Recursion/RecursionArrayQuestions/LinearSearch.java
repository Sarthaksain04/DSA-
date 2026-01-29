package RecursionandBacktracking.Recursion.RecursionArrayQuestions;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={ 1 , 4, 6, 48 , 90 , 34 , 120 };
        System.out.println(linearsearch(arr , 120 , 0));
        System.out.println(linearsearchindex(arr , 120 , 0 ));
        int[] arrays = {1 , 4 , 7 , 7 , 9 , 9 , 6 , 9 , 23 , 67 , 67  };
        linearsearchAllindex(arrays , 9 , 0 );
        System.out.println(list);
        System.out.println(findAllIndex(arrays , 7 , 0 ,  new ArrayList<>()));
    }



    static boolean linearsearch(int[] arr ,int  target ,int index){  // boolean
          if (arr.length == index ){
              return false;
          }

          return arr[index] == target || linearsearch(arr , target , index + 1);
    }
    static int linearsearchindex(int[] arr ,int  target ,int index){  // find index
        if (arr.length == index ){
            return -1;
        }
        if (arr[index] == target ) {
            return index;
        }
        else {
        return  linearsearchindex(arr , target , index + 1);
    }
}


    static ArrayList<Integer> list = new ArrayList<>();
    static void linearsearchAllindex(int[] arrays ,int  target ,int index){  // find All index of same target in array
        if (arrays.length == index ){
            return ;
        }
        if (arrays[index] == target ) {
            list.add(index);
        }
        linearsearchAllindex(arrays , target , index + 1);

    }
    static ArrayList <Integer>  findAllIndex(int[]arrays , int target , int index , ArrayList<Integer> list1){
         if (index == arrays.length){
             return list1;
         }
         if (arrays[index] == target){
             list1.add(index);
         }
         return findAllIndex(arrays, target , index  + 1, list1);
    }
}
