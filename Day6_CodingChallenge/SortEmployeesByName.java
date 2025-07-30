package collections.intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortEmployeesByName {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Raj", 103));
        employeeList.add(new Employee("Anjali", 101));
        employeeList.add(new Employee("Bhargav", 102));

        System.out.println("Before Sorting:");
        for (Employee e : employeeList) {
            System.out.println(e);
        }

        // Sort by name using Comparator
        Collections.sort(employeeList, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareToIgnoreCase(e2.name);
            }
        });

        System.out.println("\nAfter Sorting by Name:");
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
}
