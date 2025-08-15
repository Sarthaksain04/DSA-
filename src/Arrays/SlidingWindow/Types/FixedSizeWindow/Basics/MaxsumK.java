package Arrays.SlidingWindow.Types.FixedSizeWindow.Basics;

public class MaxsumK {
    public static void main(String[] args) {
        int [] arr = {1 , 2 ,3 , 4 , 5 , 6};
        int k = 3 ;
        int n = arr.length;
        int sum = 0 ;

        for (int i = 0; i <k ; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        int maxsum = sum ;
        for (int start = 1 ; start  <= n - k ; start++ ){
            sum = sum - arr[start - 1 ] + arr[start + k - 1];
            System.out.println("Window " + (start + 1) + " sum: " + sum);
            maxsum = Math.max(maxsum , sum);
        }
        System.out.println("Max sum of " + k + " consecutive elements: " + maxsum);
    }
}
