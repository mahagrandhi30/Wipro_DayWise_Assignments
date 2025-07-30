package day2tasks;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + sb.reverse());
        sc.close();
    }
}
