package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Rectangle{
      int length ;
      int width;

      Rectangle(int length , int width){
               this.length = length;
               this.width = width ;
          System.out.println(length * width);
      }
}

public class ex13 {
    public static void main(String[] args) {
           Rectangle r1 = new  Rectangle (2 , 4 );
    }
}
