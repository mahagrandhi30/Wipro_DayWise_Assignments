package collections.intro;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerSumCalculator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to add: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("\nNumbers Entered: " + numbers);
        System.out.println("Sum of all numbers: " + sum);

        scanner.close();
    }
}
