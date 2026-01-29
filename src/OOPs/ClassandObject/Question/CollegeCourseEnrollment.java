package OOPs.ClassandObject.Question;
//25. College Course Enrollment
//
//Complete Description:
//Create a Course class and allow students to enroll.
//Track total enrolled students.
//
//Brief Description:
//Tests shared/static-like behavior via objects (conceptually).

class Course{
     String courseName;
     int enrolledinthisCourse;

     static int totalEnrolledStudents = 0;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrolledinthisCourse = 0;
    }
    void enrollStudent() {
        enrolledinthisCourse++;
        totalEnrolledStudents++;
    }
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Students Enrolled in this Course: " + enrolledinthisCourse);
        System.out.println();
    }
    static void displayTotalEnrollment() {
        System.out.println("Total Students Enrolled Across All Courses: "
                + totalEnrolledStudents);
    }
}

public class CollegeCourseEnrollment {
    public static void main(String[] args) {
        Course java = new Course("Java Programming");
        Course python = new Course("Python Programming");

        java.enrollStudent();
        java.enrollStudent();

        python.enrollStudent();

        java.displayCourseDetails();
        python.displayCourseDetails();

        Course.displayTotalEnrollment();

    }
}
