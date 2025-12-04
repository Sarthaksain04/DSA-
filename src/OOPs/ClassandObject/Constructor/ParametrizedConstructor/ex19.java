package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Product {
    int id;
    int price;
    static Product[] arr = new Product[2];     
    Product(int id, int price) {
        this.id = id;
        this.price = price;
    }

    Product() {
        arr[0] = new Product(1, 200);
        arr[1] = new Product(2, 450);

        // Display array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Product ID: " + arr[i].id + ", Price: " + arr[i].price);
        }
    }
}

public class ex19 {
    public static void main(String[] args) {
        Product p1 = new Product();
    }
}
