package BasicJavaProgramms;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10 ;
        int num1 = 0 ;
        int num2 = 1  ;
        for (int i = 0; i < n  ; i++) {
            int num3 = num1 + num2 ;
            System.out.println(num3);
            num1 = num2 ;
            num2 = num3;
        }
        System.out.println(num1);
        System.out.println(num2);
    }
}
