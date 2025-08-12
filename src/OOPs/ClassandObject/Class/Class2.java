package OOPs.ClassandObject.Class;

class Book{
    String Title ;
    String Author ;
    String  Price ;

    Book(){
        Title = "Geeta";
        Author = "Shree Krishna";
        Price = "Priceless";
    }
    void Display(){
        System.out.println(Title);
        System.out.println(Author);
        System.out.println(Price);
    }
}

public class Class2 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.Display();
    }
}
