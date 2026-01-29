package RecursionandBacktracking.Recursion.BasicQuestion;

public class ReverseDigit {
    static int sum = 0 ;

    public static void main(String[] args) {
        System.out.println(reverse(231));
        System.out.println(isPalindrome(sum));
    }
    static int reverse(int n ){

         if (0 == n){
              return sum;
         }
         int rem = n % 10 ;
         sum = sum * 10 + rem ;  // 2 ---> 20 + 4 ---> 24 ----> 24 * 10 -> 240 + 8 ----> 248
       return   reverse(n / 10);
    }

    static boolean isPalindrome(int n) {
        sum = 0;
        reverse(n);
        return sum == n;  // boolean result
    }
}

// Sum = 0
// Way 1 = fun(n)
//   if(sum){
//    return ;
//
//        }
//   rem = n % 10 ;