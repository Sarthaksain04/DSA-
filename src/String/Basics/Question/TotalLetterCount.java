package String.Basics.Question;

import java.util.Scanner;

public class TotalLetterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

        String array [] = new String[n];
        int toLength = 0;

        for (int i = 0; i <n ; i++) {
            array[i] = sc.next();

            toLength = array[i].length() + toLength;
        }
        System.out.println(toLength);
    }
}
