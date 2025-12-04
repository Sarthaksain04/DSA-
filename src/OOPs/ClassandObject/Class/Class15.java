package OOPs.ClassandObject.Class;

class Square{

       int Squaree(int side){
              return side * side ;
    }

    
}

public class Class15 {
    public static void main(String[] args) {
           Square s1 = new Square();
        System.out.println(s1.Squaree(2));
    }
}
