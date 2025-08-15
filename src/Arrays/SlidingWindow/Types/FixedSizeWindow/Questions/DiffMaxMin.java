package Arrays.SlidingWindow.Types.FixedSizeWindow.Questions;

public class DiffMaxMin {
    public static void main(String[] args) {
        int [] arr = {4 , 2 , 12 , 3 , 8 , 5};
        int k = 3 ;
        for (int i = 0; i <= arr.length - k ; i++) {
             int end = i +  k - 1;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int j = i; j <=end ; j++) {
                 max = Math.max(arr[j] , max);
                 min = Math.min(arr[j] , min);

            }
            int result = max - min ;

            System.out.println(result);        }
    }
}
