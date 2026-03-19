package BitManipulation;

import java.util.Scanner;



public class DecimalTOBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to convert into binary:");
        int n = sc.nextInt();

        Binary(n);
    }
    static void  Binary(int n  ){

           if (n == 0){
               return  ;
           }
           Binary(n / 2);
        System.out.print (n %2);
    }
}
