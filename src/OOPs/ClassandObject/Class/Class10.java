package OOPs.ClassandObject.Class;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        return (double) a / b;
    }
}


public class Class10 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Add: " + c.add(5, 3));
        System.out.println("Subtract: " + c.subtract(5, 3));
        System.out.println("Multiply: " + c.multiply(5, 3));
        System.out.println("Divide: " + c.divide(5, 3));
    }
}
