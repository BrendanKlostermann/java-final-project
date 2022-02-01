/**
 * App
 */
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your weight?");
        try {
        double weight = scan.nextDouble();
        double gravity = 0.17;
        double moon_weight = weight * gravity;
        DecimalFormat df = new DecimalFormat("#.0");
        String formatted_moon = df.format(moon_weight);
        System.out.println("On the moon you would weight " + formatted_moon + "lbs.");
        } catch(InputMismatchException e) {
            System.out.println("Invalid number");
        }
    }
}