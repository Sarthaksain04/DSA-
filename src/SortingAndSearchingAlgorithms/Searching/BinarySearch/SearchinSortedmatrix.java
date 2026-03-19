package SortingAndSearchingAlgorithms.Searching.BinarySearch;

public class SearchinSortedmatrix {
    public static void main(String[] args) {

    }

    // search in the row provided
    static  int[] binarysearch(int[][] matrix , int row , int cStart , int cEnd , int target){
            while(cStart <= cEnd){
                int mid = cStart + (cEnd - cStart) / 2 ;
                if(matrix[row][mid]== target){
                    return new int[]{row , mid};
                }
                if (matrix[row][mid] < target){
                    cStart = mid+1;
                }
                else {
                    cEnd = mid - 1;
                }
            }
            return new int[]{-1 , -1};
    }
    static int[] search (int[][] matrix , int target ){
         int rows  = matrix.length ;
         int cols  = matrix[0].length ; // be cautious, matrix can  may be empty

         if (rows == 1){
            return binarysearch(matrix, 0 ,  0 , cols - 1 , target);
         }
         int rStart = 0 ;
         int rEnd = rows - 1;
         int cMid = cols / 2 ;
         // run the loop till 2 rows are remaining
        while (rStart <(rEnd - 1)){
            int mid = rStart +(rEnd - rStart)/2;
            if (matrix[mid][cMid] == target){
                return new int[] {mid , cMid};
            }
            if (matrix[mid][cMid] < target){
                 rStart = mid;
            }
            else {
                rEnd = mid;
            }
        }
        // now we have two rows
        // check where the target is in the col of 2 rows
        return  new int[] {0 , 0 };
    }
}
