package collections.intro;

import java.util.HashMap;
import java.util.Scanner;

public class MapUpdateExample {
    public static void main(String[] args) {
        HashMap<String, Integer> productPrices = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Adding initial values
        productPrices.put("Soap", 40);
        productPrices.put("Shampoo", 120);
        productPrices.put("Toothpaste", 60);

        System.out.println("Current Product Prices:");
        for (String product : productPrices.keySet()) {
            System.out.println(product + ": ₹" + productPrices.get(product));
        }

        // Update a product's price
        System.out.print("\nEnter product name to update price: ");
        String name = scanner.nextLine();

        if (productPrices.containsKey(name)) {
            System.out.print("Enter new price for " + name + ": ₹");
            int newPrice = scanner.nextInt();
            productPrices.put(name, newPrice);
            System.out.println(name + " price updated successfully.");
        } else {
            System.out.println("Product not found in the list.");
        }

        // Final output
        System.out.println("\nUpdated Product Prices:");
        for (String product : productPrices.keySet()) {
            System.out.println(product + ": ₹" + productPrices.get(product));
        }

        scanner.close();
    }
}
