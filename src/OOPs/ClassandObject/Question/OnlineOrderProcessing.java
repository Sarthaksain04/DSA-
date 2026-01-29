package OOPs.ClassandObject.Question;
//Complete Description: Create an Order class with multiple items. Calculate total bill and apply tax. Brief Description: Introduces composition-like thinking using objects


import java.util.ArrayList;
import java.util.List;

class Items{
    String itemName;
    int price;
    int quantity;
    Items(String Name , int p , int q ){
        this.itemName = Name;
        this.price = p ;
        this.quantity = q;
    }
   public  int getItemTotal(){
        return price * quantity ;
    }
}

class Order{
     int OderId;
     List<Items> items = new ArrayList<>();
     double taxRate;

     Order(int id , double tax){
         this.OderId = id;
         this.taxRate = tax;
     }
     void additem(Items item){
           items.add(item);
     }
     int calculateSubTotal(){
         int subtotal = 0 ;
         for (Items It : items ){
             subtotal = subtotal + It.getItemTotal();

         }
         return subtotal;
     }
    double calculateTax() {
         int subtotal = calculateSubTotal();
         return subtotal * taxRate;

        }
        double calculateFinalAmount(){
           int subtotal = calculateSubTotal();
           double tacx = calculateTax();
           return subtotal + tacx ;
        }
    }
public class OnlineOrderProcessing {
    public static void main(String[] args) {
        Items I1 = new Items("Sahee Paneer" , 120 , 3);
        Items I2 = new Items("Rajma Chawaal",220 , 10 );
        Items I3 = new Items("Khamman" , 20 , 12);


        Order O1 = new Order(101 , 0.67);
        O1.additem(I1);
        O1.additem(I2);
        O1.additem(I3);

        System.out.println(O1.calculateSubTotal());
        System.out.println(O1.calculateTax());
        System.out.println(O1.calculateFinalAmount());



        Order O2 = new Order(102 , 0.5);
        O2.additem(I1);
        O2.additem(I3);
        System.out.println();
        System.out.println(O2.calculateTax());
        System.out.println(O2.calculateSubTotal());
        System.out.println(O2.calculateFinalAmount());
    }
}
