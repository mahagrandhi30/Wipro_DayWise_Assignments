package collections.intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearchExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        // Sorting before binary search
        Collections.sort(numbers);
        System.out.println("\nSorted List: " + numbers);

        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();

        int index = Collections.binarySearch(numbers, target);

        if (index >= 0) {
            System.out.println("Number found at index: " + index);
        } else {
            System.out.println("Number not found.");
        }

        scanner.close();
    }
}
