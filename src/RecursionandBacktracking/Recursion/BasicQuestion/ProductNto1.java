package RecursionandBacktracking.Recursion.BasicQuestion;

public class ProductNto1 {
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }

    static int  factorial(int n ){
        if ( 0 == n){
            return 1 ;
        }

        return  n * factorial( n - 1);
    }
}
