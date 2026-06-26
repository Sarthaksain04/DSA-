package Arrays.TwoDimensionalArray.Questions;

public class TransposeMatrixinNewone {
    public static void main(String[] args) {

        int[][] arr = {
                {2 , 8  , 3 , 4  , 7},
                {7 , 2  , 1 , 6  , 3},
                {5 , 5  , 4 ,  1 , 4},
                {3 , 1  , 8 ,  2 , 6}
        };

        int row = arr.length , col = arr[0].length;
        int[][] b = new int[col][row];

        for (int i = 0; i < b.length ; i++) {
            for (int j = 0; j < b[0].length  ; j++) {
                b[i][j] = arr[j][i];

            }
         }

        print(b);
    }
    private static void print(int[][] arr){
        for (int[]a : arr) {
            for (int ele : a ) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
