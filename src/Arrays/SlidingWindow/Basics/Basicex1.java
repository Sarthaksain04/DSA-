package Arrays.SlidingWindow.Basics;

//print all window of size k

public class Basicex1 {
    public static void main(String[] args) {
        int [] arr = {1  , 2 , 3 , 4 , 5};
        int k = 3 ;


        for (int i = 0; i <= arr.length - k ; i++) {
            int end  = i + k - 1;
            for (int j = i; j <=end ; j++) {
                System.out.print(arr[j]+" ");

            }
            System.out.println();
        }
    }
}
