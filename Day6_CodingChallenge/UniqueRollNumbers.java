package collections.intro;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueRollNumbers {
    public static void main(String[] args) {
        HashSet<Integer> rollNumbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many roll numbers you want to add: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter roll number " + (i + 1) + ": ");
            int roll = scanner.nextInt();
            if (rollNumbers.add(roll)) {
                System.out.println("Added.");
            } else {
                System.out.println("Duplicate! Not added.");
            }
        }

        System.out.println("\nUnique Roll Numbers:");
        for (int roll : rollNumbers) {
            System.out.println(roll);
        }

        scanner.close();
    }
}
