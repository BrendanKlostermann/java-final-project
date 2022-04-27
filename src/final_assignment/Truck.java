package src.final_assignment;

public class Truck extends Vehicle{

    private String towCapacity;
    private String fourWheelDrive;

    public Truck(){
        super();
        towCapacity = "";
        fourWheelDrive = "";
    }

    public Truck(String make, String model, String year, String color, String bodyStyle, String towCapacity, String fourWheelDrive){
        super(make, model, year, color, bodyStyle);
        this.towCapacity = towCapacity;
        this.fourWheelDrive = fourWheelDrive;
    }

    // towCapacity methods get set validate
    public String getTowCapacity() {
        return towCapacity;
    }

    public void setTowCapacity(String towCapacity) {
        validateTowCapacity(towCapacity);
        this.towCapacity = towCapacity;
    }

    private void validateTowCapacity(String towCapacity) {
        if (towCapacity.equals("") || towCapacity == null) {
            throw new IllegalArgumentException("Truck tow capacity is required");
        }
    } // end of towCapacity

    // fourWheelDrive methods get set validate
    public String getFourWheelDrive(){
        return fourWheelDrive;
    }

    public void setFourWheelDrive(String fourWheelDrive){
        validateFourWheelDrive(fourWheelDrive);
        this.fourWheelDrive = fourWheelDrive;
    }

    private void validateFourWheelDrive(String fourWheelDrive) {
        if (fourWheelDrive.equals("") || fourWheelDrive == null) {
            throw new IllegalArgumentException("Four Wheel data is required");
        }
    }

}
