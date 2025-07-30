package day2tasks;
import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String last = sc.next();
        System.out.println("Hello, " + first + " " + last + "! Welcome to the system.");
        sc.close();
    }
}
