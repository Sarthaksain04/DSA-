package OOPs.ClassandObject.Class;

class Circle {
    double radius;

    Circle(){
        radius = 5.0;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Class3 {
    public static void main(String[] args) {
        Circle c  = new Circle();
        System.out.println(c.calculateArea());

    }
}
