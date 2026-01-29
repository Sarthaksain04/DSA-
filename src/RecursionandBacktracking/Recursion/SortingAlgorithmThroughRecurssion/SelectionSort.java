package RecursionandBacktracking.Recursion.SortingAlgorithmThroughRecurssion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 8, 1};
        sorting(arr , arr.length , 0 , 0  );
        System.out.println(Arrays.toString(arr));
    }

    static void sorting(int[] arr, int f, int l , int max) {

        if (f ==0) {
            return  ;
        }
//             if (arr[l] < arr[l + 1]){
//
//             }


        if (l < f) {
            if (arr[l] > arr[max]) {
                sorting(arr, f, l + 1, l);
            }
            else{
                sorting(arr, f , l + 1 , max );
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[f -1];
            arr[f - 1] = temp;
            sorting(arr , f -1 , 0 ,0  );
        }
    }
}

