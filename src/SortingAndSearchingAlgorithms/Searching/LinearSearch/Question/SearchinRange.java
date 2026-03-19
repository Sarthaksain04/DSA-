package SortingAndSearchingAlgorithms.Searching.LinearSearch.Question;

public class SearchinRange {
         static int range(int []arr , int target , int start , int end){
             for (int i = start; i <=end ; i++) {
                 if (arr[i]== target){
                     return  i ;
                 }
             }
             return -1;
         }
    public static void main(String[] args) {
        int[] arr = {45 , 27 , 4 , 5, 2, 9 , 23 , 19};
        int ans = range(arr , 9  , 2 , 6 );
        if (ans != -1){
            System.out.println("Found at index "+ ans);
        }
        else {
            System.out.println("Element is Out of the range");
        }
    }
}
