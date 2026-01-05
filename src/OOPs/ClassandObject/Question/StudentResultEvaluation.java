package OOPs.ClassandObject.Question;

import java.util.Scanner;

class Student1{
      int Math ;
      int Physics ;
      int Chemistry;
      double TotalMarks;
      double Percent;
      Student1(int m , int p , int c ){
             Math = m;
             Physics = p ;
             Chemistry = c ;
      }

      void Marks(){
          TotalMarks = Math + Physics + Chemistry ;
          System.out.println("TotalMarks : "+ TotalMarks);
      }

      void Percentage(){
           Percent = (TotalMarks / 300 ) * 100;
           System.out.println("Percentage : "+ Percent +"%");
      }
      enum Name{
          Sarthak, Aman , Shreya , Abha , Ria
      }

}

public class StudentResultEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student1[] s1 = new Student1[n];
        for (int i = 0; i < n ; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            int mark1  = sc.nextInt();
            int marks2 = sc.nextInt();
            int marks3 = sc.nextInt();
            s1[i] = new Student1(mark1 , marks2 , marks3);

        }
        for (int i = 0; i < n; i++) {
            System.out.println("Result of Student " + (i + 1));
            s1[i].Marks();
            s1[i].Percentage();

        }



    }
}
