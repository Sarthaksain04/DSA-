package Arrays.SlidingWindow.Basics;

public class Basicex4 {
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3 , 4 , 5 , 6  , 8};
        int sum = 0 ;
        int k = 3;

        for (int i = 0; i <k ; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Window 1 sum: " + sum);
        int minSum = sum ;

        for (int i = 1; i < arr.length - k ; i++) {
            sum = sum - arr[i - 1] + arr[i + k -1];
            System.out.println("Window " + (i + 1)+ " sum: " + sum);

            if (sum < minSum){
                minSum = sum ;
            }
        }
        System.out.println("Minimum sum of any window of size " + k + " is: " + minSum);
    }
}
