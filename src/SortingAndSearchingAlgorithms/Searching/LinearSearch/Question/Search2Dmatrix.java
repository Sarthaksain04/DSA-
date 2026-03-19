package SortingAndSearchingAlgorithms.Searching.LinearSearch.Question;

public class Search2Dmatrix {
             public static int[] Search(int[][]arr , int target){
                 for (int i = 0; i < arr.length ; i++) {
                     for (int j = 0; j < arr[0].length ; j++) {
                         if (arr[i][j] == target){
                             return new int[] {i , j};
                         }
                     }
                 }
                 return new int[] {-1 , -1};
             }

    public static void main(String[] args) {
        int[][] arr ={
                {1 , 2 , 3 , 12},
                {4 , 5 , 6 , 13},
                {7 , 8 , 9 , 14}};
        int[] ans = Search(arr , 8);
        System.out.println("Row: "+ ans[0] + " , Column: "+ans[1]);
    }
}
