package Arrays.SlidingWindow.Types.FixedSizeWindow.Questions;

public class CountAllWindowEven {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10};
        int k = 3 ;
        int countWindow= 0;


        for (int i = 0; i <= arr.length - k; i++) {
            int end  = i + k - 1;
            int count  = 0 ;
            for (int j = i ; j <= end ; j++) {

                System.out.print(arr[j]+" ");
                if (arr[j] % 2 ==0){
                    count++;
                }
            }
            if (count == k) {
                countWindow++;
            }
            System.out.println();
            System.out.println("Current valid window count: " + countWindow);

        }
        System.out.println("Total windows with all even numbers: " + countWindow);
    }
}
