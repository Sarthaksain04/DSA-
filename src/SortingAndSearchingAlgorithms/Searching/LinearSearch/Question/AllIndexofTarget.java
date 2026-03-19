package SortingAndSearchingAlgorithms.Searching.LinearSearch.Question;

public class AllIndexofTarget {
    public static void index(int[]arr , int target){
        int count = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == target){
                count++;
            }
        }

        int[] newArray = new int[count];
        int j = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == target) {
                newArray[j++] = i;

            }
        }
        for (int i = 0; i <newArray.length ; i++) {
            System.out.println(newArray[i]);
        }
    }

    public static void main(String[] args) {
        int[]arr = {1 , 2 , 3 , 2 ,4 , 2};
        index(arr , 2);
    }
}
