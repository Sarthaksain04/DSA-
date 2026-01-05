package OOPs.ClassandObject.Question;

//7. Car Information
//
//Complete Description:
//Create a class Car with attributes brand, model, and year.
//Add a method to display car details.
//
//Brief Description:
//Basic object modeling from real-world entities.

class Car{
      String Brand ;
      String Model;
      int year ;

    Car(String brand, String model, int year) {
        this.Brand = brand;
        this.Model = model;
        this.year = year;
    }

      void Display(){
          System.out.println("Brand : " + Brand);
          System.out.println("Model : " + Model);
          System.out.println("year  : " + year );
          System.out.println("______________");
      }
}

public class CarInformation {
    public static void main(String[] args) {
        Car c1 = new Car("Honda" , "Odyssey", 1990 );
        c1.Display();
        Car c2 = new Car("Ford" , "Mustang" , 1967);
        c2.Display();
    }
}
