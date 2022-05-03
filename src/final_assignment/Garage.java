package src.final_assignment;
import src.utilities.InputUtility;
import src.utilities.UIUtility;
import java.util.Scanner;


public class Garage {
    Scanner in = new Scanner(System.in);
    private Vehicle[] vehicles;
    private int vehicleCount = 4;

    public Garage(){
        vehicles = new Vehicle[10];
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


    public boolean isFull(){
        boolean full = false;
        if(vehicleCount == vehicles.length){
            full = true;
        }
        return full;
    }
}
