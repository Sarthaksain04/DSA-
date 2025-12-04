package OOPs.ClassandObject.Constructor.ConstructorOverloading;

class Student{
    String name ;
    int age ;
      Student(){
          System.out.println("No student Info ");
      }
      Student(String name , int age){
           this.name = name ;
           this.age = age ;
          System.out.println(name);
          System.out.println(age);
      }
    }

public class Co2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sarthak sain " , 21);

    }
}
