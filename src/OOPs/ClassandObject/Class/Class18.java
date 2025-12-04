package OOPs.ClassandObject.Class;

class Outer{


    class Inner{
          void show(){
              System.out.println("Hello Inner Class");
          }
    }
}

public class Class18 {
    public static void main(String[] args) {
        Outer Out = new Outer();
        Outer.Inner in  = Out.new Inner();
        in.show();

    }
}
