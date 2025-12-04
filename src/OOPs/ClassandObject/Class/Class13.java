package OOPs.ClassandObject.Class;

class Pen{
      String Color;
      String Type;
}


public class Class13 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.Color = "Blue";
        p1.Type = "Gel";
        System.out.println(p1.Color);
        System.out.println(p1.Type);

        Pen p2 = new Pen();
        p2.Color = "Black";
        p2.Type = "Boll";

        System.out.println(p2.Color);
        System.out.println(p2.Type);

    }
}



//public class Class13 {
//      String Color;
//      String Type;
//    public static void main(String[] args) {
//        Class13  p1 = new  Class13 ();
//        p1.Color = "Blue";
//        p1.Type = "Gel";
//        System.out.println(p1.Color);
//        System.out.println(p1.Type);
//
//        Class13  p2 = new  Class13 ();
//        p2.Color = "Black";
//        p2.Type = "Boll";
//
//        System.out.println(p2.Color);
//        System.out.println(p2.Type);
//
//    }
//}