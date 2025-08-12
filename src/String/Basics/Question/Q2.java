package String.Basics.Question;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter original String");
        String Original = sc.nextLine();
        String result = new String(Original);
        System.out.println(result.replace("e" , "i" ));
    }
}
