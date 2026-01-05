package OOPs.ClassandObject.Question;
//1. Student Information System
//
//Complete Description:
//Create a class Student with data members name, rollNumber, and marks.
//Create an object of the class and initialize the values using a constructor.
//Add a method displayDetails() to print student information.
//
//Brief Description:
//Tests basic class creation, object instantiation, constructor usage, and method calling.

class Student{
      String Name ;
      int rollNo ;
      int marks ;
      Student(String Name ,int rollNo , int marks){
             this.Name = Name;
             this.rollNo = rollNo;
             this.marks = marks ;
      }
      void displayDetails(){
          System.out.println(Name);
          System.out.println(rollNo);
          System.out.println(marks);
      }
}

public class StudentInformationSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Sarthak " , 49 , 90);
        Student s2 = new Student("Varun" , 50 , 89);
        s1.displayDetails();
        System.out.println();
        s2.displayDetails();

    }
}
