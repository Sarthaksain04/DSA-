package OOPs.ClassandObject.Object;


class Student {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}
public class Obj2 {
    public static void main(String[] args) {
        Student s = new Student();  // object created
        s.name = "Sarthak";
        s.rollNo = 101;
        s.display();
    }
}
