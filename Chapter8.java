import java.util.Scanner;

public class Chapter8 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 8 Menu";
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
        System.out.println("\nExiting Chapter 8 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");
        // Your code here

       
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");
        // Your code here

        
    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        // Your code here
       

    }

    public void exercise4(Scanner in) {
        UIUtility.showMenuTitle("exercise 4");
        // Your code here

        
    }
}