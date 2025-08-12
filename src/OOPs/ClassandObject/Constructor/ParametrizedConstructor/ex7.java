package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Phone {
    String brand;
    double price;

    Phone(String b, double p) {
        brand = b;
        price = p;
    }

    void display() {
        System.out.println("Phone: " + brand + ", Price: ₹" + price);
    }
}


public class ex7 {
    public static void main(String[] args) {
        Phone p = new Phone("i-phone" , 120000);
        p.display();

    }
}
