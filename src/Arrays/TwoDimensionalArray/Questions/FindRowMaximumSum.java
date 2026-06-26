package Arrays.TwoDimensionalArray.Questions;

public class FindRowMaximumSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1  , 3  , 4},
                {6  , 12 ,45},
                {65 , 34 ,58}

        };
        // 1. this hardcoded way
//        int row0 = 0 ;
//        int row1 = 0 ;
//        int row2 = 0 ;
//            for (int j = 0; j <arr[0].length ; j++) {
//                row0 += arr[0][j];
//                row1 += arr[1][j];
//                row2 += arr[2][j];
//
//
//
//            }
//        if (row0 > row1 && row0 >  row2) System.out.println(row0);
//        else  if (row1 > row0 && row1 >  row2) System.out.println(row1);
//        else System.out.println(row2+ " ");

           int maxsum = Integer.MIN_VALUE;
           int row = -1;
          for (int i = 0; i < arr.length ; i++) {
            int rowsum = 0 ;

            for (int j = 0; j <arr[0].length ; j++) {
                rowsum += arr[i][j];
            }
            if (rowsum > maxsum ){
                maxsum = rowsum;
                row = i;
            }
        }
        System.out.println(row+" "+ maxsum);

    }
}
