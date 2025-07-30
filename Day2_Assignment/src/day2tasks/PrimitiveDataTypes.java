package day2tasks;
import java.util.Scanner;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        float height;
        double weight;

        System.out.print("Enter age: ");
        age = input.nextInt();

        System.out.print("Enter height: ");
        height = input.nextFloat();

        System.out.print("Enter weight: ");
        weight = input.nextDouble();

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        input.close();
    }
}
