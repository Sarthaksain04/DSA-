package RecursionandBacktracking.Recursion.BasicQuestion;

public class Palindrome {
    static int sum = 0 ;

    public static void main(String[] args) {
        palindrome(1812);
        System.out.println(sum);

    }
    static void palindrome(int n ){

        if (0 == n){
            return ;
        }

        int rem = n % 10 ;
        sum = sum * 10 + rem ;  // 2 ---> 20 + 4 ---> 24 ----> 24 * 10 -> 240 + 8 ----> 248
        palindrome(n / 10);

    }
}
