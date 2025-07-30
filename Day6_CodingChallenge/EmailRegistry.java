package collections.intro;

import java.util.HashSet;
import java.util.Scanner;

public class EmailRegistry {
    public static void main(String[] args) {
        HashSet<String> emailSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Email Registry ---");
            System.out.println("1. Register Email");
            System.out.println("2. View Registered Emails");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter email ID: ");
                    String email = scanner.nextLine();
                    if (emailSet.add(email)) {
                        System.out.println("Email registered.");
                    } else {
                        System.out.println("This email is already registered.");
                    }
                    break;
                case 2:
                    System.out.println("\nRegistered Email IDs:");
                    for (String e : emailSet) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
