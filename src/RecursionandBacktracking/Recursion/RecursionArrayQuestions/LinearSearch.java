package RecursionandBacktracking.Recursion.RecursionArrayQuestions;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={ 1 , 4, 6, 48 , 90 , 34 , 120 };


        /// 1. boolean of target in linear

        System.out.println("1. "+linearsearch(arr , 120 , 0));


        ///2. find index

        System.out.println("2. "+ linearsearchindex(arr , 120 , 0 ));



        /// findAll index
        int[] arrays = {1 , 4 , 7 , 7 , 9 , 9 , 6 , 9 , 23 , 67 , 67  };

        linearsearchAllindex(arrays , 9 , 0 );
        /// through ArrayList Locally
        System.out.println("3. Through returning ArrayList Locally:" + list);

        /// through Method in ArrayList
        System.out.println("4. Through returning ArrayList in Method :"+findAllIndex(arrays , 7 , 0 ,  new ArrayList<>()));
    }


    ///  boolean of target in linear

    static boolean linearsearch(int[] arr ,int  target ,int index){  // boolean
          if (arr.length == index ){
              return false;
          }

          return arr[index] == target || linearsearch(arr , target , index + 1);
    }


    /// find index

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



 ///  through ArrayList

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




/// findAllIndex ArrayList with Argument

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
