package src.chapter_assignments;
import java.util.Scanner;

import src.utilities.InputUtility;
import src.utilities.TaskHandler;
import src.utilities.UIUtility;

public class Chapter1 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 1 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "Exercise 1", "Exercise 2", "Exercise 3", "Sample Exercise"
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
                    sampleExercise(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 1 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");
        // Your code here

        double first = InputUtility.getDouble("Please enter a number: ", in);
        double second = InputUtility.getDouble("Please enter another number: ", in);
        if(first > second){
            System.out.println("Largest is: " + first);
        } else {
            System.out.println("Largest is: " + second);
        }
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");
        // Your code here

        double first = InputUtility.getDouble("Please enter a number: ", in);
        double second = InputUtility.getDouble("Please enter another number: ", in);
        double average = (first + second)/2;
        System.out.printf("The average is %.2f",average);
    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        // Your code here
        double radius = InputUtility.getDouble("Please enter the radius of the circle: ", in);
        double circ = 2 * Math.PI * radius;
        double area = Math.PI * (radius*radius);
        System.out.printf("Circumference is %.2f\n", circ);
        System.out.printf("Area is %.2f\n", area);

    }

    public void sampleExercise(Scanner in) {
        UIUtility.showMenuTitle("Sample Exercise");
        String name = InputUtility.getString("What is your name?", in);
        int age = InputUtility.getIntInRange("What is your age?", 0, 120, in);
        String favFood = InputUtility.validateUserString("What is your favorite food?", new String[]{"IceCream","Pizza","Sushi","Burgers"}, in);
        int favNum = InputUtility.getInt("What is your favorite number?", in);
        double temperature = InputUtility.getDouble("What is you body temperature in Fahrenheit?", in);

        System.out.printf("%nHello %s! You are %d years old and like to eat %s. Your favorite number is %d.%n Your body temperature is %.1f degrees Fahrenheit.%n",name,age,favFood,favNum,temperature);
        
    }
}