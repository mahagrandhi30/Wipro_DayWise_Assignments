package collections.intro;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintQueueSimulator {
    public static void main(String[] args) {
        Queue<String> printQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Print Queue ---");
            System.out.println("1. Add Print Job");
            System.out.println("2. Process Next Job");
            System.out.println("3. View Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter document name: ");
                    String job = scanner.nextLine();
                    printQueue.offer(job);
                    System.out.println("Job added to print queue.");
                    break;
                case 2:
                    if (!printQueue.isEmpty()) {
                        String processed = printQueue.poll();
                        System.out.println("Printing: " + processed);
                    } else {
                        System.out.println("No jobs in the queue.");
                    }
                    break;
                case 3:
                    System.out.println("Pending Print Jobs:");
                    for (String doc : printQueue) {
                        System.out.println("- " + doc);
                    }
                    break;
                case 4:
                    System.out.println("Exiting Print Queue...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
