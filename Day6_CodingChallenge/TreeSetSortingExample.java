package collections.intro;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetSortingExample {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of countries: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter country " + (i + 1) + ": ");
            String country = scanner.nextLine();
            countries.add(country);
        }

        System.out.println("\nSorted list of countries:");
        for (String country : countries) {
            System.out.println(country);
        }

        scanner.close();
    }
}
