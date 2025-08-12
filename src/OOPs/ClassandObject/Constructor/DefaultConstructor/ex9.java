package OOPs.ClassandObject.Constructor.DefaultConstructor;

class Fan{
    int price;

    Fan(){
        price = 2000;
    }

    void ShowPrice(){
        System.out.println("Fan Price: "+ price);
    }
}

public class ex9 {
    public static void main(String[] args) {
        Fan f = new Fan();
        f.ShowPrice();
    }
}
