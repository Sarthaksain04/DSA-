package OOPs.ClassandObject.Class;

class Employee{
      int id ;
      double salary;

    Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }
    void display() {
        System.out.println("Employee ID: " + id + ", Salary: " + salary);
    }
}



public class Class17 {
    public static void main(String[] args) {
           Employee[] employees = new Employee[3];
           employees[0] = new Employee(101 , 50000);
           employees[1] = new Employee(102, 60000);
           employees[2] = new Employee(103, 55000);

        System.out.println("Employee Details:");
        for (int i = 0; i < employees.length; i++) {
            employees[i].display();
        }
    }
}
