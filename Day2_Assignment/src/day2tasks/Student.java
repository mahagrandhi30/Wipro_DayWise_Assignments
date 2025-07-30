package day2tasks;

public class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
