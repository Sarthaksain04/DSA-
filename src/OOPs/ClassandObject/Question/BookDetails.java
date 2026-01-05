package OOPs.ClassandObject.Question;

// 5. Book Details
//
//Complete Description:
//Create a class Book with title, author, and price.
//Create two objects and display their details.
//
//Brief Description:
//Tests multiple object creation from a single class.

class Book{
    String title;
    String author;
    double price;
    Book( String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
        System.out.println("----------------------");
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Book b1 = new Book("Atomic Habits", "James Clear", 450.0);
        Book b2 = new Book("Deep Work", "Cal Newport", 500.0);

b1.displayDetails();
b2.displayDetails();

    }
}
