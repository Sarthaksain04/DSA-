package OOPs.ClassandObject.Class;

import java.util.Scanner;

class Calculator1{
    int a ;
    int b ;

    void add(int a , int b ){
           this.a  = a;
           this.b = b;
           int sum = a + b ;
           System.out.println();
           System.out.println("The Answer is:"+sum);
       }
    void sub(int a , int b ){
        this.a  = a;
        this.b = b;
        int sum = a - b ;
        System.out.println();
        System.out.println(sum);
    }
    void mul(int a , int b ){
        this.a  = a;
        this.b = b;
        int sum = a * b ;
        System.out.println();
        System.out.println(sum);
    }
    void Div(int a , int b ){
        this.a  = a;
        this.b = b;
        int sum = a % b ;
        System.out.println();
        System.out.println(sum);
    }

}

public class Class14 {
    public static void main(String[] args) {
        Calculator1 c1 = new Calculator1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value 1:");
        int a = sc.nextInt();
        System.out.println("Enter the value 1:");
        int b = sc.nextInt();

        System.out.println("Select an Option:");
        String Option = sc.next();
        if (Option.equals("+") ) {
            c1.add(a , b);

        } else if (Option.equals("-")) {
            c1.sub(a , b);
        } else if (Option.equals("%")) {
            c1.Div(a , b);

        }
        else if (Option.equals("*")){
             c1.mul(a , b);
        }
    }
}
