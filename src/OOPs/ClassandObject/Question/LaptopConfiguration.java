package OOPs.ClassandObject.Question;
//10. Laptop Configuration
//
//Complete Description:
//Create a class Laptop with attributes brand, ram, and price.
//Create an object and print all values.
//
//Brief Description:
//Strengthens fundamentals of attributes and object usage.

class Laptop{
     String Brand ;
     int ram ;
     double price;

    void displayDetails() {
        System.out.println("Brand: " + Brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Price: ₹" + price);
    }
}

public class LaptopConfiguration {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.Brand = "HP";
        laptop1.ram = 16;
        laptop1.price = 65000;

        laptop1.displayDetails();
    }
}
