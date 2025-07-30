package day2tasks;

public class Manager extends Employee {
    String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager("Raj", 50000, "Sales");
        m.display();
    }
}
