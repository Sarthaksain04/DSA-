package OOPs.ClassandObject.Object;

class Car {
    String color;
    int speed;

    void show() {
        System.out.println("Color: " + color + ", Speed: " + speed);
    }
}

public class Obj3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "Red";
        c1.speed = 100;

        Car c2 = new Car();
        c2.color = "Blue";
        c2.speed = 120;

        c1.show();
        c2.show();
    }
}
