package OOPs.ClassandObject.Class;


import java.sql.SQLOutput;

class Student {
    String name;
    int age;
    double marks;


}


public class Class6 {
    public static void main(String[] args) {
        Student s  = new Student();
        s.name = "Sarthak";
        s.age = 21;
        s.marks = 87.5;
        System.out.println();

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.marks);

        System.out.println();

        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 21;
        s1.marks = 67;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.marks);

    }
}
