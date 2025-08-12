package OOPs.ClassandObject.Constructor.ParametrizedConstructor;


class Box {
    double length, breadth, height;

    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    void volume() {
        System.out.println("Volume: " + (length * breadth * height));
    }
}


public class ex5 {
    public static void main(String[] args) {
        Box b = new Box(2 , 5 ,  7);
        b.volume();
    }
}
