package OOPs.ClassandObject.Constructor.DefaultConstructor;

class Student{
      int id  ;
      String name ;
      Student(){
           id = 1 ;
           name = "Sarthak";

      }
    void Display(){
        System.out.println(id);
        System.out.println(name);
    }
}

public class ex11 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Display();
    }
}
