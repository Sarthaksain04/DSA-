package Arrays.TwoDimensionalArray.Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class MatricesMultiplication {
    public static ArrayList<ArrayList<Integer>> multiply(int[][] a , int[][]b){
        int n = a.length;

        int [][]c = new int[n][n];

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                int ans  = a[i][j] * b[i][j];
                for (int k = 0; k < n; k++) {
                    c[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            ans.add(new ArrayList<>());

            for (int j = 0; j < n; j++) {
                ans.get(i).add(c[i][j]);
            }
            
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1 , 2 },
                {7 , 8 },
        };
        int[][] b = {
                {2 , 0 },
                {1,  3}
        };

        System.out.println(multiply(a , b));



    }
}
