package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Car {
    String model;
    double price;

    Car(String m, double p) {
        model = m;
        price = p;
    }

    void display() {
        System.out.println("Model: " + model + ", Price: ₹" + price);
    }
}


public class ex3 {
    public static void main(String[] args) {
        Car c1 = new Car("s class" , 120000000);
        c1.display();
    }
}
