package OOPs.ClassandObject.Class;

class Person1{
      String Name;
      int  age;
      Person1(String Name , int age){
             this.Name = Name;
             this.age = age;
      }
      void display(Person1 p2){
          System.out.println(p2.Name);
          System.out.println(p2.age);
      }
}

public class Class16 {
    public static void main(String[] args) {
        Person1 p1 = new Person1("Sarthak", 21);
        Person1 p2 = new Person1("Aarav", 22);
        p1.display(p2);
    }
}
