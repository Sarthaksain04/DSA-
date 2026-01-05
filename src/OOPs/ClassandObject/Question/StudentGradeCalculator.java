package OOPs.ClassandObject.Question;

//16. Student Grade Calculator
//
//Complete Description:
//Create a class that calculates grades (A, B, C, Fail) based on marks.
//
//Brief Description:
//Combines object data with rule-based logic.


class Student3{
      String Name ;
      int Marks ;
      Student3(String N ,int M){
          this.Name = N  ;
          this.Marks = M ;
      }

      void GradeCalculator(){
           if(Marks < 30){
               System.out.println(Name+" is Fail" );
           }
           else if (Marks > 30 && Marks < 60) {
               System.out.println(Name+" Got C grade" );

           }

           else if (Marks > 60 && Marks < 80) {
               System.out.println(Name + " Got B grade");
           }
           else {
               System.out.println(Name + " Got A grade");
           }
      }
}

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Student3 s1 = new Student3("Sarthak Sain" , 90);
        s1.GradeCalculator();
        Student3 s2 = new Student3("Abha Jaiman" , 90);
        s2.GradeCalculator();
        Student3 s3 = new Student3("Aman" , 9);
        s3.GradeCalculator();

    }
}
