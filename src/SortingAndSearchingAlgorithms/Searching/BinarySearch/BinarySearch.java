package SortingAndSearchingAlgorithms.Searching.BinarySearch;

public class BinarySearch {

             public static  int search(int[] arr , int target){
                  int left = 0 ;
                  int right = arr.length -1;
                 for (int i = left; i <= right ; i++) {
                     int mid = left + (right  - left) /2 ;

                     if (arr[mid] == target) {
                         return mid;
                     }
                     if (arr[mid] < target){
                         left = mid+1;
                     }
                     else {
                         right = mid - 1;
                     }
                 }
                 return -1;
             }

    public static void main(String[] args) {
           int[] arr = {2 , 4 , 5 , 6, 12 , 45 , 69 };
           int  ans = search(arr , 12);
        if(ans != -1) {
            System.out.println("Element found at index " + ans);
        }else{
            System.out.println("Element not found");
        }
             }

    }


