package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Teacher {
    String name;
    String subject;

    Teacher(String n, String s) {
        name = n;
        subject = s;
    }

    void display() {
        System.out.println("Teacher: " + name + ", Subject: " + subject);
    }
}
public class ex10 {
    public static void main(String[] args) {
        Teacher t = new Teacher("Shreya " , "java");
        t.display();
    }
}
