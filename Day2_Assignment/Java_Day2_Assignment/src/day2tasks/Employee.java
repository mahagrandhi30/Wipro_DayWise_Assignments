package day2tasks;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
