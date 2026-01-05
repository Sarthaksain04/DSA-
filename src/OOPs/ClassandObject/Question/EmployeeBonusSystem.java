package OOPs.ClassandObject.Question;

//13. Employee Bonus System
//
//Complete Description:
//Create an Employee class with salary.
//Add a method that increases salary by 10% if salary is below a threshold.
//
//Brief Description:
//Focuses on decision-making using object data.




class Employee1{
      double salary ;

      Employee1(double s){
          this.salary = s ;

      }
      void Bonus(double threshold){
           if(salary < threshold){
               salary = salary + (salary * 0.10);
           }
      }
    void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeBonusSystem {
    public static void main(String[] args) {
        Employee1 emp = new Employee1(25000);
        emp.Bonus(30000);
        emp.displaySalary();

    }
}
