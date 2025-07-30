package collections.intro;

import java.util.LinkedList;

public class EmployeeLinkedList {
    public static void main(String[] args) {
        LinkedList<String> employees = new LinkedList<>();

        // Adding employee names
        employees.add("Ravi");
        employees.add("Anjali");
        employees.add("Kiran");
        employees.add("Divya");

        // Printing employee names
        System.out.println("Employee List:");
        for (String name : employees) {
            System.out.println(name);
        }
    }
}
