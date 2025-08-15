package Arrays.SlidingWindow.Basics;

public class MakingWindow {
    public static void main(String[] args) {
        int[] arr = {2 , 5 , 1 , 8, 2 , 9}; //we initialize the arr
        int k = 3; // we fix the size of window

        int end = k - 1 ; // we made another variable and fix the end

        for (int i = 0; i <= end ; i++) { // we use for loop from 0 to end to print the window
            System.out.print(arr[i]+" ");
        }

    }
}
