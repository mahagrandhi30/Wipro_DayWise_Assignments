package collections.intro;

import java.util.HashSet;
import java.util.Scanner;

public class CityNameDeduplicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> citySet = new HashSet<>();

        System.out.print("Enter number of cities: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter city " + (i + 1) + ": ");
            String city = scanner.nextLine();
            citySet.add(city);
        }

        System.out.println("\nUnique Cities Entered:");
        for (String city : citySet) {
            System.out.println(city);
        }

        scanner.close();
    }
}
