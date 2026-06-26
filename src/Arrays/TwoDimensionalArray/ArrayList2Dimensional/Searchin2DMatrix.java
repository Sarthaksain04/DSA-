package Arrays.TwoDimensionalArray.ArrayList2Dimensional;

public class Searchin2DMatrix {
    public static boolean searchMatrix ( int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[][] arr = {
                {2, 8, 3, 4, 7},
                {7, 2, 1, 6, 3},
                {5, 5, 4, 1, 4},
                {3, 1, 8, 2, 6}
        };

        System.out.println(searchMatrix(arr , 5));
    }
    }
