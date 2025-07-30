package collections.intro;

import java.util.LinkedList;
import java.util.Queue;

public class OfferPollExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements using offer()
        queue.offer("Task 1");
        queue.offer("Task 2");
        queue.offer("Task 3");

        System.out.println("Initial Queue: " + queue);

        // Removing elements using poll()
        String removed = queue.poll();
        System.out.println("Polled (removed): " + removed);
        System.out.println("Queue after polling: " + queue);

        // Peek at the next item
        String peeked = queue.peek();
        System.out.println("Next item in queue (peek): " + peeked);
    }
}
