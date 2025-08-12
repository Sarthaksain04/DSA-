package OOPs.ClassandObject.Object;

class Fan {
    int speed;

    void showSpeed() {
        System.out.println("Fan speed: " + speed);
    }
}


public class Obj4 {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.speed = 3;

        Fan f2 = new Fan();
        f2.speed = 5;

        f1.showSpeed();
        f2.showSpeed();
    }
}
