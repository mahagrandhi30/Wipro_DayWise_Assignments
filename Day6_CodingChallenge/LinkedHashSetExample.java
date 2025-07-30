package collections.intro;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of cities: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter city " + (i + 1) + ": ");
            String city = scanner.nextLine();
            if (cities.add(city)) {
                System.out.println("Added.");
            } else {
                System.out.println("Duplicate! Not added.");
            }
        }

        System.out.println("\nCities in the order entered (no duplicates):");
        for (String city : cities) {
            System.out.println(city);
        }

        scanner.close();
    }
}
