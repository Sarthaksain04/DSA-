package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Book {
    String title;
    String author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class ex1 {
    public static void main(String[] args) {
        Book b1 = new Book("Ramayan" , "Valmiki ji");
        b1.display();

        Book b2 = new Book("Geeta" , "Shree Krishna");
        b2.display();
    }
}
