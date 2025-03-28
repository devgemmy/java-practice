package E3OSCS;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> cartItems;
    private double totalAmount = 0.0;

    public ShoppingCart() {}

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public void removeProduct(Product product) {
        cartItems.remove(product);
    }

    public void calculateTotal() {
        for (Product prd : cartItems) {
            totalAmount += prd.price;
        }

        System.out.println("Total amount: " + totalAmount);
    }

    protected void applyDiscount(double percentage) {
        if (percentage > 0 || percentage < 100) {
            this.totalAmount -= percentage * this.totalAmount / 100;
            System.out.println("Discounted amount: " + totalAmount);
        }
        else System.out.println(percentage + "% is out of range.");
    }
}
