package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }
}


public class ex2 {
    public static void main(String[] args) {
        Circle r = new Circle(8);
        r.calculateArea();
    }
}
