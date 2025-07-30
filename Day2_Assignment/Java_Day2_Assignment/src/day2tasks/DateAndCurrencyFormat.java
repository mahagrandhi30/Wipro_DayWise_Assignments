package day2tasks;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateAndCurrencyFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        System.out.println("Current Date: " + sdf.format(date));
        System.out.println("Formatted Amount: " + nf.format(amount));
        sc.close();
    }
}
