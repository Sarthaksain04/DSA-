package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Book1{
      String title;
      Book1(){
           title = "unknown";
      }
      Book1(String title){
           this.title = title;
      }
}



public class ex17 {

    public static void main(String[] args) {
        Book1 b1 = new Book1();

        Book1 b2 = new Book1("The Memory Capsule");

        System.out.println("Book 1 title: " + b1.title);
        System.out.println("Book 2 title: " + b2.title);
    }

}
