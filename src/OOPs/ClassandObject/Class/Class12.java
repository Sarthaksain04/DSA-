package OOPs.ClassandObject.Class;

class Book1{
    String title;
    double price;

}

public class Class12 {
    public static void main(String[] args) {
        Book1 b1 = new Book1();    // create object

        // print default values
        System.out.println("Title: " + b1.title);
        System.out.println("Price: " + b1.price);
    }
}

//public class Book {
//    String title;   // instance variable
//    double price;   // instance variable
//
//    public static void main(String[] args) {
//        Book b1 = new Book();    // create object
//
//        // print default values
//        System.out.println("Title: " + b1.title);
//        System.out.println("Price: " + b1.price);
//    }
//}