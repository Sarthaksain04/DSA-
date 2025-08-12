package OOPs.ClassandObject.Object;

class Pen {
    String brand;
    String color;

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }
}


public class Obj5 {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.brand = "Parker";
        p.color = "Blue";
        p.showDetails();
    }
}
