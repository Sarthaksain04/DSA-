package OOPs.ClassandObject.Question;

//27. E-commerce Product Price Tracker
//
//Complete Description:
//Create products and track price changes over time.
//Display price history.
//
//Brief Description:
//Encourages thinking about object evolution.

import java.util.ArrayList;

class Product{
    private int productId;
    private String productName;
    private double currentPrice;
    private ArrayList<Double> priceHistory;

    public Product(int productId, String productName, double currentPrice) {
        this.productId = productId;
        this.productName = productName;
        this.currentPrice = currentPrice;
        this.priceHistory = new ArrayList<>();
        priceHistory.add(currentPrice); // store initial price
    }
    public void updatePrice(double newPrice) {
        if (newPrice <= 0) {
            System.out.println("Invalid price update!");
            return;
        }
        currentPrice = newPrice;
        priceHistory.add(newPrice);
        System.out.println("Price updated successfully.");
    }

    public void displayPriceHistory() {
        System.out.println("Price History of " + productName + ":");
        for (double price : priceHistory) {
            System.out.println("₹" + price);
        }
    }
    public void displayCurrentPrice() {
        System.out.println("Current Price of " + productName + ": ₹" + currentPrice);
    }
}

public class ECommerceProductPriceTracker {
    public static void main(String[] args) {

        Product product = new Product(101, "Wireless Mouse", 999.0);

        product.displayCurrentPrice();

        product.updatePrice(899.0);
        product.updatePrice(849.0);
        product.updatePrice(799.0);

        product.displayCurrentPrice();
        product.displayPriceHistory();

    }
}
