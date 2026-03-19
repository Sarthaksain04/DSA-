package SortingAndSearchingAlgorithms.Searching.JumpSearch;

public class JumpSearch {
    public static void main(String[] args) {
           int[] arr = {1 , 2 , 3,  4 , 5 , 6 , 7 , 9 , 9 , 10 , 11 , 12 , 13 , 14 , 15 , 16};
            int target = 12 ;
            int index  = performsearch(arr , target);
            System.out.println("Number found at index:" + index);
    }

    static  int performsearch(int[] arr , int target) {
        int n = arr.length;
        int steps = (int) Math.sqrt(n);
        int prev = 0;

        while (arr[Math.min(steps, n) - 1] < target) {
            prev = steps;
            steps += (int) Math.sqrt(n);

            if (prev >= n) {
                return -1;
            }
            // Linear search
            while (arr[prev] < target) {

                prev++;


                if (prev == Math.min(steps, n)){
                    return -1;

                }
            }

            if (arr[prev] == target){
                return prev;
            }
        }
 return -1;
    }
}