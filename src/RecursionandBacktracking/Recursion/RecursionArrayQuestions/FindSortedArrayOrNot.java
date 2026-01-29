package RecursionandBacktracking.Recursion.RecursionArrayQuestions;

public class FindSortedArrayOrNot {
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 4 , 8 , 9, 12};
        System.out.println(SortedArray(arr , 0 ));

    }
    static boolean SortedArray(int[] arr , int index){
        if (arr.length - 1 == index) {
            return true;
        }

        return arr[index] < arr[index + 1] && SortedArray(arr, index + 1);
    }
    
}
