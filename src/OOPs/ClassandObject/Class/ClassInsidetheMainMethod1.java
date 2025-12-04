package OOPs.ClassandObject.Class;

public class ClassInsidetheMainMethod1 {
    public static class Student{
          int id = 49;
          String name = "Sarthak sain";
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);

    }
}
