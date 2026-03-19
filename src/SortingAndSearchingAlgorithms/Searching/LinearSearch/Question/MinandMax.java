package SortingAndSearchingAlgorithms.Searching.LinearSearch.Question;

public class MinandMax {
    static int min(int[] arr){
        int mini  =arr[0];
        for (int i = 1; i < arr.length; i++) {
             if (arr[i] < mini){
                 mini  = arr[i];
             }
            
        }

        return mini;
    }
    static int max(int[] arr){
        int maxi  =arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > maxi){
                maxi = arr[i] ;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {45 , 27 , 4 , 5, 2, 9 , 23 , 19};
        int ans = min(arr);
        System.out.println(ans);

        int ans2 = max(arr);
        System.out.println(ans2);
    }
}
