package day2tasks;
import java.util.Scanner;

public class WeekdayMessage {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toUpperCase();
        Day day = Day.valueOf(input);

        switch (day) {
            case MONDAY: System.out.println("Start of the work week!"); break;
            case FRIDAY: System.out.println("Almost weekend!"); break;
            case SUNDAY: System.out.println("Rest day!"); break;
            default: System.out.println("Just a regular day.");
        }

        sc.close();
    }
}
