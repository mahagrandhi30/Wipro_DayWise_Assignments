package collections.intro;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Ticket Booking System ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. View Waiting Customers");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    customerQueue.offer(name);
                    System.out.println(name + " added to the queue.");
                    break;
                case 2:
                    if (!customerQueue.isEmpty()) {
                        String served = customerQueue.poll();
                        System.out.println("Serving customer: " + served);
                    } else {
                        System.out.println("No customers in the queue.");
                    }
                    break;
                case 3:
                    System.out.println("Waiting Customers:");
                    for (String customer : customerQueue) {
                        System.out.println("- " + customer);
                    }
                    break;
                case 4:
                    System.out.println("Exiting Ticket Booking System...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
