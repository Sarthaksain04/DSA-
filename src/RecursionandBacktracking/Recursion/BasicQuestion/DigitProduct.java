package RecursionandBacktracking.Recursion.BasicQuestion;

public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(SumofDigit(1342));
    }

    static int SumofDigit(int n ){
        if (0 == n ){
            return 1;
        }

        return (n % 10) * SumofDigit(n / 10 );
    }
}

