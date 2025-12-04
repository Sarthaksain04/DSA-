package OOPs.ClassandObject.Constructor.ConstructorOverloading;

class Circle{
    int radius;
    int diameter;
      Circle(int radius) {
            this.radius = radius;

      }
      Circle( double diameter){
          this.radius = (int) (diameter / 2);
      }
      void area(){
          System.out.println(3.14 * radius * radius );
      }
}

public class Co3 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        c1.area();
        c2.area();
    }
}
