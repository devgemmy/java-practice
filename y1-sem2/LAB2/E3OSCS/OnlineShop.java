package E3OSCS;

// Online Shopping Cart

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        ShoppingCart MrBiggs = new ShoppingCart();
        ArrayList<Product> prodStocks = new ArrayList<>();

        Scanner userInput = new Scanner(System.in);

        while (prodStocks.size() < 5) {
            System.out.print("Enter product ID: ");
            int productID = userInput.nextInt();
            System.out.print("Enter product name: ");
            String productName = userInput.next();
            System.out.print("Enter product price: ");
            double productPrice = userInput.nextDouble();

            prodStocks.add(new Product(productID, productName, productPrice));
        };

        for (Product prod : prodStocks) {
            MrBiggs.addProduct(prod);
        }

        MrBiggs.removeProduct(prodStocks.get(2));

        if (prodStocks.size() > 3) {
            MrBiggs.calculateTotal();
            MrBiggs.applyDiscount(30);
        }
        else MrBiggs.calculateTotal();

    }
}
