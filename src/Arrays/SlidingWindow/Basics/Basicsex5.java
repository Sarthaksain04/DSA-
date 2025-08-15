package Arrays.SlidingWindow.Basics;

public class Basicsex5 {
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3 , 4 , 5 , 6 };
        int sum = 0 ;
        int k = 3;
        int count = 0;


        for (int i = 0; i <k ; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Window 1 sum: " + sum);
        if (sum % 2 == 0 ){
            count++;
        }
        for (int i = 1; i <= arr.length - k ; i++) {
            sum = sum - arr[i - 1] + arr[i + k -1];
            System.out.println("Window " + (i + 1)+ " sum: " + sum);
            if (sum % 2 == 0 ){
                count++;
            }

        }

        System.out.println("the count of even number is " +count);


    }
}
