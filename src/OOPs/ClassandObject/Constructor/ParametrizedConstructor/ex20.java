package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Outer{
      class Inner{
            Inner(String message){
                System.out.println("Message is : " + message );
            }
      }
}


public class ex20 {
    public static void main(String[] args) {
           Outer out = new Outer();
        Outer.Inner in = out.new Inner("hi ");
    }
}
