package Arrays.SlidingWindow.Types.FixedSizeWindow.Questions;

public class AverageEachWindow {
    public static void main(String[] args) {
        int [] arr =  {1 , 2 , 3 , 4 , 5  , 6 , 7 , 8};
        int k = 3 ;

          for(int i = 0 ; i <= arr.length - k ; i++ ){
              double sum = 0 ;
             int end = i + k - 1 ;

              for (int j = i ; j <=end ; j++) {
                  sum += arr[j];
              }
                  double Average = sum/ k;

              for (int j = i; j <=end ; j++) {
                  System.out.println(arr[j]+" ");
              }
              System.out.println("The Average is: " + Average);
        }
    }
}
