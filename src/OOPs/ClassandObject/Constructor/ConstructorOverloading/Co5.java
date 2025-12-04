package OOPs.ClassandObject.Constructor.ConstructorOverloading;
class Book{
    String title;
    String author;
    String price;
      Book(String title){
           this.title = title;
          System.out.println("Book Title is : " + title);
      }
      Book(String title  , String author ){
           this.title = title ;
           this.author = author ;
          System.out.println();
          System.out.println("Book Title is : " + title);
          System.out.println("Book Author is : " + author);

      }
      Book(String title  , String author ,  String price){
          this.title = title ;
          this.author = author ;
          this.price = price;
          System.out.println();
          System.out.println("Book Title is : " + title);
          System.out.println("Book Author is : " + author);
          System.out.println("Book Price is : " + price);
      }

}

public class Co5 {
    public static void main(String[] args) {
        Book b1 = new Book("Geeta");
        Book b2 = new Book("Geeta " , "Shree Krishna");
        Book b3 = new Book("Geeta " , "Shree Krishna" , "Priceless");


    }
}
