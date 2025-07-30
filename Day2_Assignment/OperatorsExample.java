package day2tasks;
import java.util.Scanner;

public class OperatorsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition: " + (a + b));
        System.out.println("Greater number: " + (a > b ? a : b));
        System.out.println("Are both positive? " + (a > 0 && b > 0));
        sc.close();
    }
}
