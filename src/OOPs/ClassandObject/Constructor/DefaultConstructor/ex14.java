package OOPs.ClassandObject.Constructor.DefaultConstructor;

class Rectangle{
      int length;
      int width;
      Rectangle(){
           length = 3 ;
           width = 4 ;
           System.out.println("Area: " + (length * width));

      }
}

public class ex14 {
    public static void main(String[] args) {
           Rectangle r1 = new Rectangle();


    }
}
