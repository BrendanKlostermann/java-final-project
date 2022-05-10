package src.final_assignment;
import src.utilities.InputUtility;
import src.utilities.UIUtility;
import java.util.Scanner;


public class Garage {
    Scanner in = new Scanner(System.in);
    private Vehicle[] vehicles;
    private int vehicleCount = 4;

    public Garage(){
        vehicles = new Vehicle[6];
        vehicles[0] = new Vehicle("Chevy", "Camaro", "2017", "Gray","Coupe");
        vehicles[1] = new Vehicle("Subaru","Outback","2002","Red","Sedan");
        vehicles[2] = new Truck("GMC","Sierra","2002","Green","Truck","5000","Four Wheel Drive");
        vehicles[3] = new Truck("Ford","f-150","2016","Silver","Truck","5000","Four Wheel Drive");
    }
    
    public void add(){
        UIUtility.showMenuTitle("Add a vehicle to Garage");
        
        if(!isFull()){


            String type = InputUtility.validateUserString("Would you like to enter a Truck, or vehicle?", new String[]{"car","Truck"}, in);


            Vehicle vehicle = new Vehicle();
            
            // For type Car

            while(true){
                String make = InputUtility.getString("Please enter a vehicle make: ", in);
                try {
                    vehicle.setMake(make);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            while(true){
                String model = InputUtility.getString("Please enter a vehicle model: ", in);
                try {
                    vehicle.setModel(model);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            while(true){
                String year = InputUtility.getString("Please enter a four digit year: ", in);
                try {
                    vehicle.setYear(year);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            while(true){
                String color = InputUtility.getString("Please enter a vehicle color: ", in);
                try {
                    vehicle.setColor(color);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            
            while(true){
                String bodyStyle = InputUtility.getString("Please enter a vehicle bodyStyle: ", in);
                try {
                    vehicle.setBodyStyle(bodyStyle);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }



            // For type Truck
            
            if(type.equalsIgnoreCase("truck")){
                Truck truck = new Truck();

                truck.setMake(vehicle.getMake());
                truck.setModel(vehicle.getModel());
                truck.setYear(vehicle.getYear());
                truck.setColor(vehicle.getColor());
                truck.setBodyStyle(vehicle.getBodyStyle());

                while(true){
                    String towCapacity = InputUtility.getString("Please enter the trucks tow capacity: ", in);
                    try {
                        truck.setTowCapacity(towCapacity);
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }

                while(true){
                    String fourWheelDrive = InputUtility.getString("Does this truck have 4x4:  ", in);
                    try {
                        truck.setFourWheelDrive(fourWheelDrive);
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }  
                
                vehicles[vehicleCount] = truck;
                vehicleCount++;
                UIUtility.pressEnterToContinue(in);
            }

            if(type.equalsIgnoreCase("car")){
                vehicles[vehicleCount] = vehicle;
                vehicleCount++;
                UIUtility.pressEnterToContinue(in);
            }
            
        }
        else{
            System.out.println("The Garage is full and can not add another vehicle.");
        }
    }

    public void viewAll(){

        UIUtility.showMenuTitle("View all vehicles in the Garage");

        for(int i = 0; i < vehicles.length; i++)
            if(vehicles[i] != null){
                System.out.println(vehicles[i].toString()+"\n");
            }
    }

    public void viewAllByMake(){
        // make copy of array
        //sort copy of array
        // print values

        //make copy of original list
        Vehicle[] copy;
        copy = new Vehicle[vehicles.length];
        for(int i = 0; i<vehicles.length;i++){
            if(vehicles[i] != null){
            copy[i] = vehicles[i];
            }
        }
        
        //sort copied list
        for(int i = 0; i < copy.length; i++){
            if(copy[i+1] == null){
                break;
            }
            if(copy[i].getMake().compareToIgnoreCase(copy[i+1].getMake()) > 0){
                Vehicle temp = copy[i];
                copy[i] = copy[i+1];
                copy[i+1] = temp;
            }
        }

        //print sorted list
        for(int i = 0; i < copy.length; i++){
            if(copy[i] != null){
                System.out.println(copy[i].toString()+"\n");
            }
        }


    }

    public void updateVehicle(){
        String[] menuOptions = new String[vehicleCount];
        for(int i = 0; i < vehicleCount; i++){
            menuOptions[i] = vehicles[i].getMake() + vehicles[i].getModel();
        }
        
        int choice = UIUtility.showMenuOptions("Update a Vehicle", "Choose a vehicle", menuOptions, in);
        if(choice == 0){
            return;
        } else if(choice == menuOptions.length + 1){
            return;
        }
        Vehicle vehicle = vehicles[choice - 1];

        while(true){
            String make = InputUtility.getString("Please enter a new vehicle make", in);
            try {
                vehicle.setMake(make);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while(true){
            String model = InputUtility.getString("Please enter the new vehicle model", in);
            try {
                vehicle.setModel(model);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while(true){
            String year = InputUtility.getString("Please enter the new vehicle year", in);
            try {
                vehicle.setYear(year);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while(true){
            String color = InputUtility.getString("Please enter the new vehicle color", in);
            try {
                vehicle.setColor(color);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while(true){
            String bodyStyle = InputUtility.getString("Please enter the new vehicle bodystyle", in);
            try {
                vehicle.setBodyStyle(bodyStyle);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        if(vehicle instanceof Truck){
            Truck truck = new Truck();

                truck.setMake(vehicle.getMake());
                truck.setModel(vehicle.getModel());
                truck.setYear(vehicle.getYear());
                truck.setColor(vehicle.getColor());
                truck.setBodyStyle(vehicle.getBodyStyle());

                while(true){
                    String towCapacity = InputUtility.getString("Please enter the trucks tow capacity", in);
                    try {
                        truck.setTowCapacity(towCapacity);
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }

                while(true){
                    String fourWheelDrive = InputUtility.getString("Does this truck have 4x4", in);
                    try {
                        truck.setFourWheelDrive(fourWheelDrive);
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }  
                
                UIUtility.pressEnterToContinue(in);
            }
            System.out.println("The Vehicle has been updated.");

        }

    public void moveAVehicle(){
        String[] menuOptions = new String[vehicleCount];
        for(int i = 0; i < vehicleCount; i++){
            menuOptions[i] = vehicles[i].getMake() + " " + vehicles[i].getModel();
        }
        int choice = UIUtility.showMenuOptions("Move a vehicle", "What vehicle would you like to move", menuOptions, in);
        Vehicle vehicle = vehicles[choice - 1];
        int moveTo = InputUtility.getIntInRange("Which spot would you like to move it to", 1, vehicleCount, in);

        for(int i = choice; i <= moveTo;i++){
            // assign object at pos i to value at pos i - 1
            Vehicle temp = vehicles[i-1];
            vehicles[i-1] = vehicles[i];
            vehicles[i] = temp;

        }
        // assign the vehicle to the move to position
    }

    public void removeVehicle(){
        String[] menuOptions = new String[vehicleCount];
        for(int i = 0; i < vehicleCount; i++){
            menuOptions[i] = vehicles[i].getMake() + " " + vehicles[i].getModel();
        }
        int choice = UIUtility.showMenuOptions("Remove a vehicle", "What vehicle would you like to remove", menuOptions, in);
        if (choice == 0){
            return;
        } else if (choice == menuOptions.length){
            return;
        }
        for(int i = choice; i <= vehicleCount;i++){
            // assign object at pos i to value at pos i - 1
            Vehicle temp = vehicles[i-1];
            vehicles[i-1] = vehicles[i];
            vehicles[i] = temp;
        }

        vehicles[vehicleCount] = null;
        vehicleCount--;

        
    }

    public void viewAVehicle(){
        String[] menuOptions = new String[vehicleCount];
        for(int i = 0; i < vehicleCount; i++){
            menuOptions[i] = vehicles[i].getMake() + " " + vehicles[i].getModel();
        }
        int choice = UIUtility.showMenuOptions("Choose a vehicle", "What vehicle would you like to view", menuOptions, in);
        if (choice == 0){
            return;
        } else if (choice == menuOptions.length){
            return;
        }
        Vehicle vehicle = vehicles[choice - 1];
        System.out.println(vehicle.toString());
        if(vehicle instanceof Truck){
            
            Truck truck = new Truck();

            System.out.println("Tow capacity: " + truck.getTowCapacity());
            System.out.println("Four Wheel Drive: " + truck.getFourWheelDrive());
        }

    }

    public boolean isFull(){
        boolean full = false;
        if(vehicleCount == vehicles.length){
            full = true;
        }
        return full;
    }


}
