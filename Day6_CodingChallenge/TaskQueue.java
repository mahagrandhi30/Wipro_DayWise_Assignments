package collections.intro;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskQueue {
    public static void main(String[] args) {
        Queue<String> taskQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Task Queue Menu ---");
            System.out.println("1. Add Task");
            System.out.println("2. Process Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    String task = scanner.nextLine();
                    taskQueue.add(task);
                    System.out.println("Task added.");
                    break;
                case 2:
                    if (!taskQueue.isEmpty()) {
                        String processed = taskQueue.poll();
                        System.out.println("Processing task: " + processed);
                    } else {
                        System.out.println("No tasks to process.");
                    }
                    break;
                case 3:
                    System.out.println("Tasks in Queue:");
                    for (String t : taskQueue) {
                        System.out.println("- " + t);
                    }
                    break;
                case 4:
                    System.out.println("Exiting Task Queue...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
