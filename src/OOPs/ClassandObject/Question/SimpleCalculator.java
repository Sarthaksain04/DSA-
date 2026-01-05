package OOPs.ClassandObject.Question;


//6. Simple Calculator
//
//Complete Description:
//Create a class Calculator with methods add, subtract, multiply, and divide.
//Call these methods using an object.
//
//Brief Description:
//Introduces behavior-focused class design.

class Calculator{
    int a;
    int b ;


    void add(int num1 , int num2 ){
        this.a = num1 ;
        this.b  = num2 ;
        int ans = a + b ;
        System.out.println(ans);
    }
    void sub(int num1 , int num2 ){
        this.a = num1 ;
        this.b  = num2 ;
        int ans = a - b ;
        System.out.println(ans);
    }
    void div(int num1 , int num2 ){
        this.a = num1 ;
        this.b  = num2 ;
        int ans = a / b ;
        System.out.println(ans);
    }


}


public class SimpleCalculator {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(2 , 5);
        c1.div(8, 2);
        c1.sub(5, 2);

    }
}
