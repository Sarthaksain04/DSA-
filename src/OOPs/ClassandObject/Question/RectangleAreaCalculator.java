package OOPs.ClassandObject.Question;


//2. Rectangle Area Calculator
//
//Complete Description:
//Create a class Rectangle with attributes length and breadth.
//Add a method calculateArea() that returns the area of the rectangle.
//Create an object and print the area.
//
//Brief Description:
//Checks understanding of object properties and simple behavior methods.

class Rectangle{
     int len ;
     int bre ;

     public int calculateArea(){
          return len * bre ;
     }

}

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.bre = 5;
        r1.len = 4;
        System.out.println(r1.calculateArea());

        Rectangle r2 = new Rectangle();
        r2.bre = 5;
        r2.len = 9;
        System.out.println(r2.calculateArea());

    }

}
