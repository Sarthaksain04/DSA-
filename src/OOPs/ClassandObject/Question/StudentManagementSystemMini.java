package OOPs.ClassandObject.Question;

//21. Student Management System (Mini)
//
//Complete Description:
//Create a system where multiple Student objects are created.
//Each student has marks, and system calculates class average.
//
//Brief Description:
//Tests object interaction and aggregation.


import java.util.ArrayList;

class Student4{
      String name ;
      int rollno;
      int marks;
      Student4(   String N ,  int R  ,int M){
          this.name = N;
          this.rollno = R;
          this.marks = M ;
      }

      int  getMarks(){
          return  marks;
      }
    public void displayDetails() {
        System.out.println("Name: " + name +
                ", Roll No: " + rollno +
                ", Marks: " + marks);
    }
}

class StudentManagement{
     ArrayList<Student4> students;

     StudentManagement(){
         students = new ArrayList<>();
     }

     void addStudent(Student4 student){
          students.add(student);
     }

    public void displayAllStudents() {
        for (Student4 s : students) {
            s.displayDetails();
        }
    }
        public double calculateClassAverage() {
            if (students.isEmpty()) return 0;

            int totalMarks = 0;
            for (Student4 s : students) {
                totalMarks += s.getMarks();
            }
            return (double) totalMarks / students.size();
        }
}

public class StudentManagementSystemMini {
    public static void main(String[] args) {
        Student4  s1 = new Student4 ("Aman", 101, 85);
        Student4  s2 = new Student4 ("Riya", 102, 90);
        Student4  s3 = new Student4 ("Kunal", 103, 78);

        StudentManagement m1 =  new StudentManagement();
        m1.addStudent(s1);
        m1.addStudent(s2);
        m1.addStudent(s3);
        System.out.println("Student Details:");
        m1.displayAllStudents();

        System.out.println("\nClass Average Marks: " +
                m1.calculateClassAverage());
    }
}
