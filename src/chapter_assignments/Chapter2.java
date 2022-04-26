package src.chapter_assignments;
import java.util.Scanner;

import src.utilities.InputUtility;
import src.utilities.TaskHandler;
import src.utilities.UIUtility;

public class Chapter2 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 2 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Exercise 1", "Exercise 2", "Exercise 3", "Exercise 4"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    exercise1(in);
                    break;
                case 2:
                    exercise2(in);
                    break;
                case 3:
                    exercise3(in);
                    break;
                case 4:
                    exercise4(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 2 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");
        // Your code here

        int number = InputUtility.getInt("Please enter a whole number: ", in);

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");
        // Your code here

        double number = InputUtility.getDouble("Please enter a decimal number: ", in);
        int numInt = (int) number;
        int numDec = (int) ((number - numInt) * 100);
        System.out.println(numInt);
        System.out.println(numDec);

    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        // Your code here

        for (int i = 2; i < 100; i++) {
            boolean value = false;

            for (int f = 2; f < i / 2 + 1; f++) {
                int check = i % f;
                // if(f==i){
                // break;
                // }
                if (check == 0) {
                    value = true;
                    break;
                }
            }
            if (value == false) {
                System.out.print(i + " ");
            }
        }
    }

    public void exercise4(Scanner in) {
        UIUtility.showMenuTitle("exercise 4");
        // Your code here

        int seconds = InputUtility.getInt("Please enter an amount of seconds: ", in);
        int days = seconds / 86400;
        int days_seconds_left = seconds % 86400;
        int hours = days_seconds_left / 3600;
        int hours_seconds_left = days_seconds_left % 3600;
        int minutes = hours_seconds_left / 60;
        int minutes_seconds_left = minutes % 60;
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + minutes_seconds_left);
    }
}