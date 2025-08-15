package Arrays.SlidingWindow.Types.FixedSizeWindow.Questions;

public class CountWindowsumisgreater {
    public static void main(String[] args) {
        int [] arr = { 1 , 2 , 3 , 4 , 5 , 6};
        int k = 3 ;
        int x = 10;
        int sum = 0;
        int count = 0 ;

        for (int i = 0; i < k ; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Window 1 sum is :" +sum);

        for (int i = 1; i <= arr.length - k ; i++) {

            sum = i + arr[ i - 1 ] + arr[i + k - 1];
            System.out.println("Window " + (i + 1) + " sum: " + sum);
            if (sum > x){
               count++;
            }
            System.out.println(count);
        }
    }
}
