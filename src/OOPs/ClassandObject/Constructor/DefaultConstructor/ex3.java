package OOPs.ClassandObject.Constructor.DefaultConstructor;


class Laptop{
    String brand;

    Laptop(){
        brand = "Dell";
    }
    void showBrand(){
        System.out.println("Brand:" + brand);
    }
}

public class ex3 {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.showBrand();

    }
}
