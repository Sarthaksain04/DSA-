package Arrays.TwoDimensionalArray.Questions;

public class FindMaxin2DArray {
   static int val = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int[][] arr = {
                {1  , 3  , 4},
                {6  , 12 ,45},
                {65 , 34 ,58}

        };

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                 if (arr[i][j] > val ){
                     val = arr[i][j];

                 }
            }
        }
        System.out.println(val);

    }
}
