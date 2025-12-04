package OOPs.ClassandObject.Constructor.DefaultConstructor;

class Employee{
      Employee(){
          System.out.println("Employee created");
      }
}

public class ex12 {
    public static void main(String[] args) {
    Employee e1 = new Employee();
    Employee e2 = new Employee();
    Employee e3 = new Employee();
    }
}
