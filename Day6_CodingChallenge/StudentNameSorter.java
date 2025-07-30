package collections.intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentNameSorter {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();
        scanner.nextLine();  // consume leftover newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter student name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            studentNames.add(name);
        }

        Collections.sort(studentNames);

        System.out.println("\nStudent names in alphabetical order:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        scanner.close();
    }
}
