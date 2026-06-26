package Arrays.TwoDimensionalArray.Questions;

public class FindMiniFromAllMaxelementofeachrow {

    public static void main(String[] args) {
        int[][] arr ={
                {2 , 8 , 3 , 4 , 7 },
                {7 , 2 , 1 , 6 , 3},
                {5 , 5 , 4 , 1 , 4},
                {3 , 1 , 8 , 2 , 6}
        };

        int minOfRowMax = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            int mini = Integer.MIN_VALUE;
            for (int j = 0; j <arr[0].length ; j++) {
                int val = arr[i][j];
                if (val > mini) mini = val;

            }

            if (minOfRowMax  > mini) minOfRowMax  = mini ;
        }
        System.out.println(minOfRowMax );
    }
}
