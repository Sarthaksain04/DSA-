package Arrays.SlidingWindow.Basics;

public class SlidingWindowSum {
    public static void main(String[] args) {
        int [] arr = {2 , 5 , 1 , 8  , 2 , 9};
        int k = 3 ;
        int sum = 0 ;
        for (int i = 0; i < k; i++) {
            sum = arr[i] + sum ;
        }
        System.out.println("window 1 sum: "+ sum);

        for (int start = 1; start <=arr.length - k ; start++) {
            sum = sum - arr[start - 1 ] + arr[start + k - 1];
            System.out.println("Window " + (start + 1) + " sum: " + sum);

        }

    }
}
