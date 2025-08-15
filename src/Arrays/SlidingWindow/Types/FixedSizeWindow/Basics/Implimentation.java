package Arrays.SlidingWindow.Types.FixedSizeWindow.Basics;

public class Implimentation {
    public static void main(String[] args) {
        int [] arr = {2 , 5 , 1 , 8 , 2 , 9};
        int k = 3 ;
        int n = arr.length;
        int sum =  0;

        //sum of  1st window
        for (int i = 0; i < k  ; i++) {

            sum += arr[i];

        }
        System.out.println("Window 1 sum: " + sum);

        // Slide the Window
        for (int start = 1; start <= n - k; start++) {
            sum = sum - arr[start - 1] + arr[start + k - 1];
            System.out.println("Window " + (start + 1) + " sum: " + sum);
        }

    }
}
