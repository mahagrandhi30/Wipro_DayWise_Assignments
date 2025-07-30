package day2tasks;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char ch = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Character '" + ch + "' appears " + count + " times.");
        sc.close();
    }
}
