package OOPs.ClassandObject.Class;

class Book{
    String Title ;
    String Author ;
    String  Price ;

}

public class Class2 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.Title = "Geeta";
        b1.Author = "Shree Krishna";
        b1.Price = "Priceless";
        System.out.println(b1.Title);
        System.out.println(b1.Author);
        System.out.println(b1.Price);
    }
}
