package Arrays.SlidingWindow.Basics;

public class Basicex2 {
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3 , 4 , 5 , 6 };
        int sum = 0 ;
        int k = 3;

        for (int i = 0; i <k ; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Window 1 sum: " + sum);

        for (int i = 1; i < arr.length - k ; i++) {
            sum = sum - arr[i - 1] + arr[i + k -1];
            System.out.println("Window " + (i + 1)+ " sum: " + sum);
        }
    }
}
