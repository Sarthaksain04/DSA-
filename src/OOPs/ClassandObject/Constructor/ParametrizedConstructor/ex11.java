package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

import java.sql.SQLOutput;

class Person{
      int age;
      String Name ;

      Person( int age , String Name){
          this.age  = age;
          this.Name = Name;
      }
      void Display(){
          System.out.println(age);
          System.out.println(Name);
      }
}

public class ex11 {
    public static void main(String[] args) {
        Person p1 = new Person(21 , "Sarthak");
        p1.Display();
        Person p2 = new Person(22 , "Kia");
        p2.Display();
    }
}
