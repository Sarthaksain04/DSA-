package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Employee{
    String Emp;
     Employee(String Emp){
            this.Emp = Emp ;
     }
    Employee(Employee e) {
        this.Emp = e.Emp; // Copy the name from the given object
    }
    void display() {
        System.out.println("Employee Name: " + Emp);
    }
}

public class ex14 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sarthak");


        Employee e2 = new Employee(e1);

        e1.display();
        e2.display();

    }
}
