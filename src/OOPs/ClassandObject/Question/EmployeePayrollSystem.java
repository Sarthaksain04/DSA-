package OOPs.ClassandObject.Question;
//24. Employee Payroll System
//
//Complete Description:
//Create employees with different working hours.
//Calculate salary based on hours worked.
//
//Brief Description:
//Focuses on object-based calculation systems.

class Employees{
    int EmployeeId;
    String EmployeeName;
    int hoursworked;
    double hourlyrate;
    double salary;

    Employees(int EmployeeId ,String EmployeeName ,int hoursworked ,double hourlyrate){
        this.EmployeeId = EmployeeId;
        this.EmployeeName = EmployeeName;
        this.hoursworked = hoursworked;
        this.hourlyrate = hourlyrate;

    }
        void calculatesalary(){
                salary = hoursworked * hourlyrate;
        }
    void updateHoursWorked(int hoursWorked) {
        this.hoursworked = hoursWorked;
    }

    void updateHourlyRate(double hourlyRate) {
        this.hourlyrate = hourlyRate;
    }
    void displayEmployeeDetails() {
        System.out.println("ID: " + EmployeeId);
        System.out.println("Name: " + EmployeeName);
        System.out.println("Hours Worked: " + hoursworked);
        System.out.println("Hourly Rate: " + hourlyrate);
        System.out.println("Salary: " + salary);
        System.out.println("------------------------");
    }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Employees emp1 = new Employees(101, "Rahul", 40, 500);
        Employees emp2 = new Employees(102, "Anita", 35, 450);

        emp1.calculatesalary();
        emp2.calculatesalary();

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}
