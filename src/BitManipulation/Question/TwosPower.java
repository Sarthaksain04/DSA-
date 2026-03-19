package BitManipulation.Question;

import java.util.Scanner;

public class TwosPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = 1;
        System.out.println(1<<n );   // it gieves 2 power n
        System.out.println(x<<n);
    }
}
