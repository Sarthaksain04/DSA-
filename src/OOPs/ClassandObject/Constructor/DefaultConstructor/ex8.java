package OOPs.ClassandObject.Constructor.DefaultConstructor;

class Chair{
    String material ;

    Chair(){
        material = "Wood";
    }
    void display(){
        System.out.println(material);
    }
}

public class ex8 {
    public static void main(String[] args) {
        Chair c = new Chair();
        c.display();
    }
}
