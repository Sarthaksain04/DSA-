package RecursionandBacktracking.Recursion.SortingAlgorithmThroughRecurssion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4 , 3 , 2 , 1};
        Sorting(arr , arr.length - 1, 0 );
        System.out.println(Arrays.toString(arr));
    }

    static void Sorting(int[]arr , int f , int l){
        if(f == 0 ){
            return;
        }
        if (l < f){
           if (arr[l] > arr[l + 1]){
               int temp = arr[l];
               arr[l] = arr[l + 1];
               arr[l + 1] = temp;

           }
           Sorting(arr , f , l +1);

        }
        else{
            Sorting(arr, f - 1 , 0 );
        }
    }
}
