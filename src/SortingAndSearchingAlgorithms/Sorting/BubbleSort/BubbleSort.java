package SortingAndSearchingAlgorithms.Sorting.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr = {5 , 1 , 4 , 2 , 8};

        bubble(arr);

        for (int num : arr){
            System.out.print(num + " ");
        }
    }

    static void  bubble(int []arr){

        int n = arr.length  - 1;

        for (int i = 0; i < n  ; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i; j++) {
                 if (arr[j] > arr[j + 1]){
                      int temp = arr[j];
                      arr[j] = arr[j + 1];
                      arr[j + 1] = temp ;
                      swapped = true ;
                 }

            }
            if (!swapped) break ;
        }
    }
}
