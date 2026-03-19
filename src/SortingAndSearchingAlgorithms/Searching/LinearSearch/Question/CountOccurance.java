package SortingAndSearchingAlgorithms.Searching.LinearSearch.Question;

public class CountOccurance {
    public static int Count(int []arr , int target){
        int count = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == target) count++;

        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3 , 2 , 4 , 2};
        int ans = Count(arr, 2);
        System.out.println(ans);
    }
}
