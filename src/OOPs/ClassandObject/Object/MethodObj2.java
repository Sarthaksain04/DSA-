package OOPs.ClassandObject.Object;

class Car1 {
    String model;
    String company;
    double price;

    void initialize(String m, String c, double p) {
        model = m;
        company = c;
        price = p;
    }

    void display() {
        System.out.println(company + " " + model + " costs ₹" + price);
    }
}

public class MethodObj2 {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.initialize("s class" , "Audi" , 1222222);
        c1.display();
    }
}
