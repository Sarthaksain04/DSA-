package OOPs.ClassandObject.Object;

class Product {
    int id;
    String name;
    double price;

    void assignDetails(int i, String n, double p) {
        id = i;
        name = n;
        price = p;
    }

    void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: ₹" + price);
    }
}


public class MethodObj4 {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.assignDetails(1 , "Face Wash" , 150.50);
        p1.printDetails();
    }
}
