package Arrays.SlidingWindow.Types.FixedSizeWindow.Questions;

import java.util.Arrays;

public class PrintLastEelementEachWindow {
    public static void main(String[] args) {
        int [] arr = { 1 , 2 , 3 , 4 , 5 ,6 , 7 , 8 };
        int k = 3  ;

        int[] res = new int[arr.length];


        for (int i = 0; i <= arr.length - k ; i++) {
            int end  = i + k - 1 ;

            for (int j = i; j <= end ; j++) {
                res[i] = arr[end];

                System.out.print(arr[j]+ " ");
            }
            System.out.println();
        }
        System.out.println("First elements of each window: " + Arrays.toString(res));

    }
}
