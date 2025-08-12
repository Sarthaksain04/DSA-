package OOPs.ClassandObject.Constructor.DefaultConstructor;

import java.sql.SQLOutput;

class Pen{
    String Color;

    Pen(){
        Color = "Black";
    }

    void showColor(){
        System.out.println(Color);
    }
}



public class ex5 {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.showColor();
    }
}
