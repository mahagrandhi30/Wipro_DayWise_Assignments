package collections.intro;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> taskQueue = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of tasks with priority: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter priority of task " + (i + 1) + ": ");
            int priority = scanner.nextInt();
            taskQueue.offer(priority);
        }

        System.out.println("\nProcessing tasks by priority (lowest first):");
        while (!taskQueue.isEmpty()) {
            System.out.println("Processing task with priority: " + taskQueue.poll());
        }

        scanner.close();
    }
}
