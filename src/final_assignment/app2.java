package src.final_assignment;
import java.util.Scanner;
import src.utilities.UIUtility;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        Garage garage = new Garage();
        while (true) {
            String menuTitle = "Main Menu";
            String prompt = "Choose an Option";
            String[] menuOptions = {
                    "Add a vehicle",
                    "View list of all vehicles",
                    // "Remove a vehicle",
                    // "Update a vehicle",
                    // "Sort vehicles by make",
                    // "View the towing Capacity of a truck",
                    // "View all information on a vehicle",
                    // "Swap position of two vehicles",
                    
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, scanner);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    garage.add();
                    break;
                case 2:
                    garage.viewAll();
                    break;
                // case 3:
                //     new Chapter3().handleTask(scanner);
                //     break;
                // case 4:
                //     new Chapter4().handleTask(scanner);
                //     break;
                // case 5:
                //     new Chapter5().handleTask(scanner);
                //     break;
                // case 6:
                //     new Chapter6().handleTask(scanner);
                //     break;
                // case 7:
                //     new Chapter7().handleTask(scanner);
                //     break;
                // case 8:
                //     new Chapter8().handleTask(scanner);
                //     break;
                
            }
            UIUtility.pressEnterToContinue(scanner);
        }
        System.out.println("\nProgram complete. Goodbye.\n");
        scanner.close();
    }
}
