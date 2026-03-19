package SortingAndSearchingAlgorithms.Sorting.MergeSort;



// Time-Complexity

public class MergeSort {
//    n logn ----Time Complexity
    public static void Conquer(int[]arr , int s , int mid, int e ){
           int[] merged = new int[e - s + 1];

           int idx1 = s ;
           int idx2 = mid + 1 ;
           int x = 0 ;
//           O(n)
           while(idx1 <= mid && idx2 <= e ){
               if (arr[idx1] <= arr[idx2]){
                   merged[x++] = arr[idx1++];

               }else {
                   merged[x++] = arr[idx2++];
               }
           }
           while(idx1 <= mid ){
               merged[x++] = arr[idx1++];
           }
           while(idx2<=  e){
               merged[x++] = arr[idx2++];

           }
        for (int i = 0 , j = s ; i < merged.length; i++ , j++) {
               arr[j]= merged[i];
        }
    }

    public static void divide(int[]arr , int s , int e ){
        if(s >= e){
            return ;
        }
//        O(logn)
        int mid = s + (e - s)/2;
        divide(arr , s , mid );
        divide(arr , mid + 1 , e);
        Conquer(arr, s , mid , e);

    }
    public static void main (String [] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divide(arr , 0 , n - 1 );
//        print
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
}
