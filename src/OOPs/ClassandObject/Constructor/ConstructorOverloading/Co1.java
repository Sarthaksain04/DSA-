package OOPs.ClassandObject.Constructor.ConstructorOverloading;

class Rectangle {
    int length;
    int width;
      Rectangle(){
             length = 1 ;
             width  = 1 ;


      }
      Rectangle(int length , int width ){
             this.length = length ;
             this.width = width ;
      }
    void printArea() {
        int area = length * width;
        System.out.println("Area = " + area);
    }


}

public class Co1 {
    public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(2 , 5 );

    r1.printArea();
    r2.printArea();
    }
}
