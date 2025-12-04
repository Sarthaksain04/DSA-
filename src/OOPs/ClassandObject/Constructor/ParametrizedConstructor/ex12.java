package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Car1{
    String Brand;
    int price;
      Car1(String Brand , int price){
          this.Brand = Brand;
          this.price = price;

      }
      void print(){
          System.out.println(Brand);
          System.out.println(price);
      }
}

public class ex12 {
    public static void main(String[] args) {
        Car1 c1 = new Car1("Toyota" , 10000000);
        c1.print();
        Car1 c2 = new Car1("Audi" , 10000000);
        c2.print();
        Car1 c3 = new Car1("Mustang 1979" , 10000000);
        c3.print();
    }
}
