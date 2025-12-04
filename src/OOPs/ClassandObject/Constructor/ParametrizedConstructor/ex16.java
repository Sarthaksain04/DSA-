package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Mobile{
      String brand ;
      int price;
      Mobile( String brand , int price){
            this.brand = brand;
            this.price = price;
      }
      void print(){
          System.out.println(brand);
          System.out.println(price);
      }
}


public class ex16 {
    public static void main(String[] args) {
           Mobile m1 = new Mobile("Samsung Galaxy s24" , 40000 );
           m1.print();
    }
}
