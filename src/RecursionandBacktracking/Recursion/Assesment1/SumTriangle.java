package RecursionandBacktracking.Recursion.Assesment1;

import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sumtriangle(arr);


    }
   static void  sumtriangle(int[] arr){
        if(1 == arr.length){
            System.out.println(Arrays.toString(arr));

            return ;
        }
        int[] temp = new int[arr.length - 1];
       for (int i = 0; i < temp.length; i++) {
           temp[i] = arr[i] + arr[i + 1];

       }
       sumtriangle(temp);

       System.out.println(Arrays.toString(arr));

   }

}
