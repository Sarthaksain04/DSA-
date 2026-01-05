package OOPs.ClassandObject.Question;

//4. Circle Area Program
//
//Complete Description:
//Create a class Circle with a data member radius.
//Add a method area() to calculate and print the area of the circle.
//
//Brief Description:
//Reinforces object-based calculations and class-method relationships.

class Circle{
      int radius ;

      double area(){
          return Math.PI * radius * radius;

      }

}

public class CircleAreaProgram {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 2;
        System.out.println(c1.area());
    }
}
