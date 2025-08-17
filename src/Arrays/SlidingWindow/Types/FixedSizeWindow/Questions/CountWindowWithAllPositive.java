package Arrays.SlidingWindow.Types.FixedSizeWindow.Questions;

public class CountWindowWithAllPositive {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3  , 4 , 5 , 6 , 7 , 8};
        int k = 3 ;

        int windowCount = 0 ;

        for (int i = 0; i <= arr.length - k ; i++) {
             int end  = i + k - 1 ;
             int count = 0;

            for (int j = i; j <=end ; j++) {

                System.out.print(arr[j] + " ");
                if (arr[j] >= 0) {
                    count++;
                }
            }
                if (count == k){
                    windowCount++;
                }
                System.out.println("Current valid window count: " + windowCount);

        }
        System.out.print("Total window count with all Positive numbers is: " + windowCount);
    }
}
