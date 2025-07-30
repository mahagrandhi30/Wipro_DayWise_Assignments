package day2tasks;
import java.util.Scanner;

public class StudentVariable {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        double marks = sc.nextDouble();
        char grade = sc.next().charAt(0);
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
