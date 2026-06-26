package Arrays.TwoDimensionalArray.Questions;

import java.util.ArrayList;

public class SpirallyTraversingMatrix {

    public static ArrayList<Integer> spirallyTraver(int[][]arr){
         ArrayList<Integer> ans = new ArrayList<>();

         int m = arr.length , n = arr[0].length;
         int firstRow = 0 , lastRow = m - 1 , firstcol = 0 , lastCol = n - 1 ;
         while(firstRow <= lastRow && firstcol <= lastCol){
             // right

             for (int j = firstcol; j <= lastCol ; j++) {
                 ans.add(arr[firstRow][j]);
             }
                 firstRow++;

                 if (firstRow > lastRow || firstcol>lastCol) break ;

                 // down

                 for (int i = firstRow; i <=lastRow ; i++) {
                     ans.add(arr[i][lastCol]);
                 }
                 lastCol--;


                 if (firstRow > lastRow || firstcol>lastCol) break ;


                 // left

                     for (int k = lastCol; k >=firstcol ; k--) {
                         ans.add(arr[lastRow][k]);
                     }
                         lastRow--;

                         if (firstRow > lastRow || firstcol>lastCol) break ;


                     //up
                         for (int l = lastRow; l >= firstRow ; l--) {
                             ans.add(arr[l][firstcol]);


                         }
                      firstcol++;
                     }

         return ans ;

    }

    public static void main(String[] args) {
        int[][] arr = {
                {1 , 2   ,3  ,4  , 5 ,  6},
                {7 , 8   ,9  ,10 , 11, 12},
                {13, 14  ,15 ,16 , 17, 18},
                {19, 20  ,21 ,22 , 23, 24},
                {25, 26  ,27 ,28 , 29 ,30}
        };

        System.out.println(spirallyTraver(arr));

    }
}
