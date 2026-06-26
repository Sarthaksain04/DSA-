package Arrays.TwoDimensionalArray.Questions;

public class Rotatematrix90Degree {
    public static void main(String[] args) {
        int[][] arr = {
                {2 , 8  , 3 ,  4 },
                {7 , 2  , 1 ,  6 },
                {5 , 5  , 4 ,  1 },
                {3 , 1  , 8 ,  2 }
        };
        for (int i = 1; i < arr.length ; i++) {
            for (int j = 0; j < i  ; j++) {
                int temp  = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            int startcol = 0 ;
            int endcol = arr[0].length - 1 ;
            while (startcol < endcol){
                  int temp = arr[i][startcol];
                  arr[i][startcol] = arr[i][endcol];
                    arr[i][endcol] = temp ;
                  startcol++;
                  endcol--;
            }
        }


    }
}
