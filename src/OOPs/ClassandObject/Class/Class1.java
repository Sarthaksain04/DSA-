package OOPs.ClassandObject.Class;

class ClassName{
    int x ;

    ClassName(){
        x = 10 ;
    }
    void display(){
        System.out.println(x);
    }
}

public class Class1{
    public static void main(String[] args) {
        ClassName c1 = new ClassName();
        c1.display();
    }
} 