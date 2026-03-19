package RecursionandBacktracking.Recursion.SubsequenceandSubsetThroughRecursion;

public class SubsetRecursion {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        subset(arr, 0, "");
    }

    static void subset(int[] arr, int index, String p) {
        if (index == arr.length) {
            System.out.println(p);
            return;
        }

        // include
        subset(arr, index + 1, p + arr[index] + " ");

        // exclude
        subset(arr, index + 1, p);
    }
}


