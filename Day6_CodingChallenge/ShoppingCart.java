package collections.intro;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Cart");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name to add: ");
                    String product = scanner.nextLine();
                    cart.add(product);
                    System.out.println(product + " added to cart.");
                    break;
                case 2:
                    System.out.print("Enter product name to remove: ");
                    String removeProduct = scanner.nextLine();
                    if (cart.remove(removeProduct)) {
                        System.out.println(removeProduct + " removed from cart.");
                    } else {
                        System.out.println("Product not found in cart.");
                    }
                    break;
                case 3:
                    System.out.println("\nYour Shopping Cart:");
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty.");
                    } else {
                        for (String item : cart) {
                            System.out.println("- " + item);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting Shopping Cart...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
