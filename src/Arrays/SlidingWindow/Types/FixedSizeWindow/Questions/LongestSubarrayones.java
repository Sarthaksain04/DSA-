package Arrays.SlidingWindow.Types.FixedSizeWindow.Questions;

public class LongestSubarrayones {
    public static void main(String[] args) {
        int [] arr = {1 , 1 , 0 , 1};
        int count = 0 ;
        for (int i = 0; i < arr.length  ; i++) {
            if (arr[i] == 1){
                count++;
            }

        }
        System.out.println(count);
    }
}
