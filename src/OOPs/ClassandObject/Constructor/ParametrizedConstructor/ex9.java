package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Laptop {
    String brand;
    int ram;
    double price;

    Laptop(String b, int r, double p) {
        brand = b;
        ram = r;
        price = p;
    }

    void display() {
        System.out.println("Laptop: " + brand + ", RAM: " + ram + "GB, Price: ₹" + price);
    }
}


public class ex9 {
    public static void main(String[] args) {
        Laptop l = new Laptop("Lenovo" , 128 ,   75000);
        l.display();
    }
}
