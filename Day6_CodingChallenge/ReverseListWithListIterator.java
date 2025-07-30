package collections.intro;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ReverseListWithListIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names.add(scanner.nextLine());
        }

        System.out.println("\nNames in reverse order:");
        ListIterator<String> iterator = names.listIterator(names.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        scanner.close();
    }
}
