package OOPs.ClassandObject.Class;

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


public class Class8 {
    public static void main(String[] args) {
        Person p = new Person("Ravi", 25);
        p.show();
    }

}
