package RecursionandBacktracking.Recursion.BasicQuestion;

public class OnetoN {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n ){
        if (0  == n ){
            return;
        }

        print(n - 1);
        System.out.println(n);
    }
}
