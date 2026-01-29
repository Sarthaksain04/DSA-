package RecursionandBacktracking.Recursion.BasicQuestion;

public class CountZeroes {

    public static void main(String[] args) {
        System.out.println(countZero(30304 , 0));

    }
    static int  countZero(int n , int count){

           if(n == 0){
               return count;
           }

          if ( n % 10 == 0){
             return   countZero(n/ 10 , count + 1 );
          }
        return countZero(n/10 , count);
    }
}
