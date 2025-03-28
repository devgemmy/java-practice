package E3OSCS;

import E2SHAS.Device;

import java.util.HashMap;

public class Product {
    private int productID;
    public String name;
    protected double price;

    public Product(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public String getProductDetails() {
//        System.out.println("Product ID: " + productID);
//        System.out.println("Name: " + name);
//        System.out.println("Price: " + price);

        return "Product ID: " + productID + ", Name: " + name + ", Price: " + price;
    }

    protected void updatePrice(double newPrice) {
        this.price = newPrice;
    }
}

