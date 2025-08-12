package OOPs.ClassandObject.Object;

class Student1{
    int rollno ;
    String name;

    void insertRecord( int r , String n ){
        rollno = r;
        name = n;
    }

    void display(){
        System.out.println(rollno);
        System.out.println(name);
    }
}

public class MethodObj1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.insertRecord(49 , "Sarthak");
        s1.display();
    }
}
