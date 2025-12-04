package OOPs.ClassandObject.Constructor.DefaultConstructor;

class Book1{
    String Title;
    int price;

    Book1(){
            Title = "Geeta";
            price = 500;
      }
      void Display(){
          System.out.println(Title);
          System.out.println(price);
      }
}

public class ex13 {
    public static void main(String[] args) {
        Book1 b1 = new Book1();
        b1.Display();

    }
}
