package OOPs.ClassandObject.Class;

import java.sql.SQLOutput;

class Car{
      String brand  = "hondai"; // This is STatic Fieldonly belongd to this class
      int year = 2004 ;
      void Display(){
        System.out.println(year);
        System.out.println(brand);
    }
}

public class Class11 {
    public static void main(String[] args) {
           Car c1 = new Car();
           c1.Display();
    }
}

//public class Class11 {
//    class Car{
//        String brand  = "hondai";
//        int year = 2004 ;
//        void Display(){
//            System.out.println(year);
//            System.out.println(brand);
//        }
//    }
//    public static void main(String[] args) {
//           Class11 car = new Class11()
//           Car c1 = car.new Car();
//           c1.Display();
//    }
//}
