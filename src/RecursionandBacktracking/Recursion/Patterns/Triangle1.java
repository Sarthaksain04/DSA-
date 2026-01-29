package RecursionandBacktracking.Recursion.Patterns;

public class Triangle1 {
    public static void main(String[] args) {
        printTriangle(4 , 0);
    }
   static void printTriangle(int rows , int column) {
        if (rows == 0){
            return;
        }
       if (rows > column) {
           System.out.print("*  ");
           printTriangle(rows, column + 1);

       }
       else {
           System.out.println();
           printTriangle(rows - 1 ,0);
       }
   }
}
