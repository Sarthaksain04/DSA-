package OOPs.ClassandObject.Constructor.ConstructorOverloading;

class Car{
      String brand;
      int year;
      Car() {
          System.out.println("This is Empty");
      }
      Car(String brand){
          this.brand = brand;
      }
      Car(String brand , int year){
          this.brand = brand ;
          this.year = year ;
      }
      void print(){
          System.out.println(brand);
          System.out.println(year);
      }

}


public class Co4 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Mercedes");
        Car c3 = new Car("Mercedes" , 1998);
        c1.print();
        c2.print();
        c3.print();
    }
}
