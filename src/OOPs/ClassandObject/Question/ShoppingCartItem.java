package OOPs.ClassandObject.Question;

//20. Shopping Cart Item
//
//Complete Description:
//Create a class CartItem with price and quantity.
//Add method to apply discount if total exceeds a certain amount.
//
//Brief Description:
//Combines conditions, calculations, and object state.

class CartItem {

    double price;
    int quantity;

    // Constructor
    CartItem(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total price
    double calculateTotal() {
        return price * quantity;
    }

    // Method to apply discount
    double applyDiscount() {
        double total = calculateTotal();

        // Apply 10% discount if total exceeds 1000
        if (total > 1000) {
            total = total - (total * 0.10);
        }

        return total;
    }

    // Display final bill
    void displayBill() {
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Final Amount: " + applyDiscount());
    }
}

public class ShoppingCartItem {
    public static void main(String[] args) {

        CartItem item = new CartItem(250, 5);
        item.displayBill();
    }
}
