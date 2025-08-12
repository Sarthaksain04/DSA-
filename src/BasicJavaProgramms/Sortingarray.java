package BasicJavaProgramms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sortingarray {
    public static void main(String[] args) {
        int[] arr ={1, 2 , 4 , 3 , 7 , 5 };
        int left = 0;
        int right = 1 ;
        for (int i = 0 ; i < arr.length-1 ; i++) {
            if(arr[left] > arr[right]){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right]  = temp;

            }
            left++;
            right++;
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
