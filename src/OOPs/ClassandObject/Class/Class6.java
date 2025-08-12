package OOPs.ClassandObject.Class;


class Student {
    String name;
    int age;
    double marks;

    Student(){
        name = "Sarthak";
        age = 21;
        marks = 87.5;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}


public class Class6 {
    public static void main(String[] args) {
        Student s  = new Student();

        s.display();
    }
}
