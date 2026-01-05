package OOPs.ClassandObject.Question;

// 15. Inventory Item
//
//Complete Description:
//Create a class Item with itemName, price, and quantity.
//Add method to calculate total cost.
//
//Brief Description:
//Tests real-world modeling with derived values.


class Item{
      String itemName  ;
      int price ;
      int quantity ;
      Item(String I , int  P , int q){
          this.itemName = I;
          this.price = P;
          this.quantity = q ;

      }
      void TotalCost(){
          int totalcost = price * quantity ;
          System.out.println(itemName+" : "+ totalcost);

      }
}

public class InventoryItem {
    public static void main(String[] args) {
        Item I1 = new Item("Incyclopedia" , 120 , 5);
        I1.TotalCost();

        Item I2 = new Item("Maths" , 1200 , 5);
        I2.TotalCost();
    }
}
