package RecursionandBacktracking.Recursion.BasicQuestion;

public class SumNto1 {
    public static void main(String[] args) {
        System.out.println(print(5));

    }

    static int print(int n ){
          if (0 == n){
              return 0 ;
          }

          return n + print( n - 1);
    }
}
