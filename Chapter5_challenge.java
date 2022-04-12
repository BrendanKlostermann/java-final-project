import java.util.Scanner;
import java.util.*;

public class Chapter5_challenge implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 5 challenege Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "task 1", "task 2", "task 3", "task 4", "task 5"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    task1(in);
                    break;
                case 2:
                    task2(in);
                    break;
                case 3:
                    task3(in);
                    break;
                case 4:
                    task4(in);
                    break;
                case 5:
                    task5(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 5 challenge Menu.");
    }

    public void task1(Scanner in) {
        UIUtility.showMenuTitle("Task 1");
        int[] list = {0, 1, 2, 3, 4};
        // Your code here
        //ask for a number
        //ask where it should go(only allow numbers 0-4 for where)
        //print updated list
        int temp;
        boolean cont = true;
        int number = InputUtility.getInt("Please enter a number to enter: ", in);
        int position = InputUtility.getIntInRange("Please enter a position to enter it: ", 0, list.length, in);
        //shift all values after num2

        for(int i = list.length - 2; i >= position; i--){
            list[i + 1] = list[i];
        }
        list[position] = number;
        System.out.println(Arrays.toString(list));
               
    }

    public void task2(Scanner in) {
        UIUtility.showMenuTitle("Task 2");
        Integer[] list = {0, 1, 2, 3, 4};
        // Your code here
        // make values nullable(change to Integer class object)
        //ask which number to delete
        //print updated list
        Integer remove = InputUtility.getIntInRange("Which number would you like to delete: ", 0 , 4, in);
        list[remove] = null;
        System.out.println(Arrays.toString(list));

        
    }

    public void task3(Scanner in) {
        UIUtility.showMenuTitle("Task 3");
        int[] list = {0, 1, 2, 3, 4};
        // Your code here
        //ask first number to swap
        //ask second number to swap
        //use a temp variable
        //swap the values
        //print updated list
        int num1 = InputUtility.getIntInRange("Please enter the first number to swap", 0, 4, in);
        int num2 = InputUtility.getIntInRange("Please enter the second number to swap", 0, 4, in);
        int temp = list[num1];
        list[num1] = num2;
        list[num2] = temp;
        System.out.println(Arrays.toString(list));
       

    }

    public void task4(Scanner in) {
        UIUtility.showMenuTitle("task 4");
        int[] list = {0, 1, 2, 3, 4};
        // Your code here
        //shift values 1 spot to the right
        //use a reverse loop to change positioning
        //print updated list
        int beginning = list[0];
        for(int i = 0; i < list.length - 1; i++){
                list[i] = list[i + 1];
        }
            list[list.length - 1] = beginning;

        
        System.out.println(Arrays.toString(list));

        
    }

    public void task5(Scanner in) {
        UIUtility.showMenuTitle("task 5");
        int[] list = {0, 1, 2, 3, 4};
        // Your code here
        //print in reverse order
        int temp ;
        for(int i = 1; i < list.length - 1; i++){
            Arrays.sort(list, 0, list.length);
        }
        System.out.println(Arrays.toString(list));
        
        
    }
}