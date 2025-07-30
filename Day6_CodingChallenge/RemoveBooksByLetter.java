package collections.intro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveBooksByLetter {
    public static void main(String[] args) {
        ArrayList<String> bookTitles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter title of book " + (i + 1) + ": ");
            String title = scanner.nextLine();
            bookTitles.add(title);
        }

        System.out.print("\nEnter starting letter to remove: ");
        char startChar = scanner.nextLine().toLowerCase().charAt(0);

        Iterator<String> iterator = bookTitles.iterator();
        while (iterator.hasNext()) {
            String title = iterator.next();
            if (title.toLowerCase().startsWith(String.valueOf(startChar))) {
                iterator.remove();
            }
        }

        System.out.println("\nRemaining Book Titles:");
        for (String book : bookTitles) {
            System.out.println(book);
        }

        scanner.close();
    }
}
