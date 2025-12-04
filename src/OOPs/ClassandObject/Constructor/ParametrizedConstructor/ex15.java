package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Person1{
      String name ;
      int age ;
      Person1(){
          System.out.println("Default Constructor called");


      }
      Person1(String name , int age ){
             this.name = name ;
             this.age = age;
      }
      void print(){
          System.out.println(name);
          System.out.println(age);
      }

}

public class ex15 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        Person1 p2 = new Person1("Sarthak" , 21);
        p2.print();

    }
}
