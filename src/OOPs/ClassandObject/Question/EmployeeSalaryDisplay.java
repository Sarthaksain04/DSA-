package OOPs.ClassandObject.Question;

//3. Employee Salary Display
//
//Complete Description:
//Create a class Employee with attributes id, name, and salary.
//Initialize values using constructor and create a method showEmployee().
//
//Brief Description:
//Focuses on object state initialization and encapsulating data in a class.

class Employee{
      int id ;
      String name ;
      int salary;

      Employee(int id ,  String name ,  int salary){
           this.id = id ;
           this.name = name ;
           this.salary = salary;

    }
    void showEmployee(){
        System.out.println(id +" " + name+"  " + salary);

    }
}

public class EmployeeSalaryDisplay {
    public static void main(String[] args) {
        Employee e1 = new Employee(1 , "Sarthak Sain" , 80000 );
        Employee e2 = new Employee(2 , "Abha Jaiman" , 80000);
        Employee e3 = new Employee(3 , "Jetha lal ", 1000000);
        e1.showEmployee();
        e2.showEmployee();
        e3.showEmployee();


    }
}
