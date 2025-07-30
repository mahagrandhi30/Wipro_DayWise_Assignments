package day2tasks;
import java.util.Scanner;

public class EvenNumbersPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n * 2; i += 2) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
