package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Student {
    int roll;
    String name;

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No: " + roll + ", Name: " + name);
    }
}


public class ex8 {
    public static void main(String[] args) {
        Student s1 = new Student(12 , "sarthak");
        s1.display();
    }
}
