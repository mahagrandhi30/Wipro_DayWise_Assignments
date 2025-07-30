package collections.intro;

import java.util.HashMap;
import java.util.Scanner;

public class StudentMarksMap {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter marks for " + name + ": ");
            int marks = scanner.nextInt();
            scanner.nextLine(); // consume newline
            studentMarks.put(name, marks);
        }

        System.out.println("\nStudent Marks:");
        for (String name : studentMarks.keySet()) {
            System.out.println(name + ": " + studentMarks.get(name));
        }

        scanner.close();
    }
}
