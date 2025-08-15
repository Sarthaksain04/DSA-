package Arrays.SlidingWindow.Types.FixedSizeWindow.Basics;

public class MinsumK {
    public static void main(String[] args) {
        int[] arr = { 1 , 2 , 3 , 4 , 5 , 6};
        int k = 3 ;
        int n = arr.length;

        int sum = 0 ;

        for (int i = 0; i < k  ; i++) {
            sum =  arr[i] + sum;

        }
        System.out.println("Window 1 sum: " +sum);

        int minsum = sum ;
        for (int Start  = 1 ; Start  <= n - k ; Start ++) {
            sum = sum - arr[Start - 1 ] + arr[Start  + k - 1];
            System.out.println("window "+ ( Start+ 1) + " is "+ sum);
            minsum = Math.min(minsum , sum);
        }
        System.out.println("Min sum of " + k + " consecutive elements: " + minsum);

    }
}
