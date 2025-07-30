package day2tasks;
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        double avg = sum / 5.0;
        System.out.println("Average: " + avg);
        sc.close();
    }
}
