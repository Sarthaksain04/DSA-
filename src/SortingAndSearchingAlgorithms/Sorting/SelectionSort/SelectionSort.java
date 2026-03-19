package SortingAndSearchingAlgorithms.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        Selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void Selection(int[] arr) {
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            int last = arr.length - i   -1  ;
            int maxindex = getmax(arr , 0 , last);
            swap(arr , maxindex ,last );
        }
    }

    static void swap(int[] arr , int first , int second ){
         int temp = arr[first];
         arr[first] = arr[second];
         arr[second] = temp;
    }
    static int getmax(int[]arr , int start , int end){
        int max = start ;
        for (int i = start ; i <=end  ; i++) {
            if (arr[max] < arr[i]){
                max = i ;
            }
        }
        return max ;
    }
}