package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Circle1{
      int radius;
      Circle1(int radius){
             this.radius = radius;
             System.out.println("Area: " + 3.14 * radius * radius);
             System.out.println("Circumference: " + 2 * 3.14 * radius);
      }

}

public class ex18 {
    public static void main(String[] args) {
             Circle1 c1 = new Circle1(5);
    }
}
