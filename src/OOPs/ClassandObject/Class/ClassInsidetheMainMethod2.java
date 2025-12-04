package OOPs.ClassandObject.Class;

public class ClassInsidetheMainMethod2 {
        class Student{
              int id = 49 ;
              String Name = "Sarthak sain";
        }
    public static void main(String[] args) {
           ClassInsidetheMainMethod2 obj = new ClassInsidetheMainMethod2();
           Student s1 = obj.new Student();  //obj.new Student() → creates a new instance of the inner class Student that belongs to obj.
        System.out.println("Your Roll number is:" + s1.id);
        System.out.println("Your name is:" + s1.Name);
    }
}
