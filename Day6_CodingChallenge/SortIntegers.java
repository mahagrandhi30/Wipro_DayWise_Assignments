package collections.intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to sort: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        System.out.println("\nOriginal List: " + numbers);

        Collections.sort(numbers);
        System.out.println("Ascending Order: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Order: " + numbers);

        scanner.close();
    }
}
