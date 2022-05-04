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
                    "View all by Make",
                    "Update a vehicle",
                    "Move a vehicle",
                    "View a vehicle",
                    "Remove a vehicle"
                    // "Sort vehicles by make",
                    // "Sort vehicles by model",
                    
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
                case 3:
                    garage.viewAllByMake();;
                    break;
                case 4:
                    garage.updateVehicle();
                    break;
                case 5:
                    garage.moveAVehicle();;
                    break;
                case 6:
                    garage.viewAVehicle();
                    break;
                case 7:
                    garage.removeVehicle();
                    break;
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
