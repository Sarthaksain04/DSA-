package OOPs.ClassandObject.Object;

class Dog{
    int leg;

    Dog(){

        leg = 4 ;
    }
    void  Display(){
        System.out.println(leg);
    }
}


public class Obj1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.Display();
    }
}
