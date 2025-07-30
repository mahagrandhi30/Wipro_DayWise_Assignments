package collections.intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductPriceFilter {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Add sample products
        products.add(new Product("Laptop", 55000));
        products.add(new Product("Mouse", 600));
        products.add(new Product("Keyboard", 1200));
        products.add(new Product("Monitor", 9500));
        products.add(new Product("Speaker", 2200));

        // Sort products by price
        Collections.sort(products, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.price, p2.price);
            }
        });

        System.out.println("Sorted Product List by Price:");
        for (Product p : products) {
            System.out.println(p);
        }

        // Search within price range
        System.out.print("\nEnter min price: ");
        double min = scanner.nextDouble();
        System.out.print("Enter max price: ");
        double max = scanner.nextDouble();

        System.out.println("\nProducts in price range ₹" + min + " - ₹" + max + ":");
        for (Product p : products) {
            if (p.price >= min && p.price <= max) {
                System.out.println(p);
            }
        }

        scanner.close();
    }
}
