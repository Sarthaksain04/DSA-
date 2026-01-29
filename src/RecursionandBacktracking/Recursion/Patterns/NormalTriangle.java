package RecursionandBacktracking.Recursion.Patterns;

public class NormalTriangle {
        public static void main(String[] args) {
            printTriangle(4 , 0);
        }
        static void printTriangle(int rows , int column) {
            if (rows == 0){
                return;
            }
            if (column < rows) {
                printTriangle(rows, column + 1);
                System.out.print("*  ");


            }
            else {
                printTriangle(rows - 1 ,0);
                System.out.println();

            }
        }


}
