package RecursionandBacktracking.Recursion.SortingAlgorithmThroughRecurssion;


import java.util.Arrays;

// This type of Merge SOrt Doesn't use new  array each tmie its do the sorting in same array
public class InplaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {5 , 4 , 3 , 2 , 1};
         Sort(arr , 0 , arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void Sort(int[]arr , int start , int end){
         if (end - start ==1){
             return ;
         }
         int mid  = (start + end) / 2 ;
         Sort(arr , start , mid);
         Sort(arr , mid , end);

         mergeInPlace(arr , start , mid , end);

    }
     static void mergeInPlace(int[]arr , int start , int mid , int end) {

         int[] mix = new int[end - start];

         int i = start;
         int j = mid;
         int k = 0;

         while (i < mid && j < end) {
             if (arr[i] < arr[j]) {
                 mix[k] = arr[i];
                 i++;
             } else {
                 mix[k] = arr[j];
                 j++;
             }
             k++;
         }
         while (i  < mid){
              mix[k] = arr[i];
              i++;
              k++;
         }
         while (j < end){
             mix[k] = arr[j];
             j++;
             k++;
         }
         for (int l = 0 ; l < mix.length ; l++){
             arr[ start + l ] = mix[l];
         }
     }
}
