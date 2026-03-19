package SortingAndSearchingAlgorithms.Searching.LinearSearch;

public class LinearSearch {
    static int linearsearch(int []arr , int target){
        for (int i = 0; i <= arr.length ; i++) {
            if (arr[i] == target){
                return i ;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
          int[]arr={10, 25 , 7 , 40 , 15};
           int result = linearsearch(arr , 40);
           if (result != -1){
               System.out.println("Element Found at " + result);
           }
           else{
               System.out.println("element not found");
           }

    }
}
