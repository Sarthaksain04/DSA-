package OOPs.ClassandObject.Constructor.DefaultConstructor;


class Bike{
    int speed = 120;

    Bike(){
        System.out.println(speed);
    }
}

public class ex2 {
    public static void main(String[] args) {
        Bike b1 = new Bike();

    }
}
