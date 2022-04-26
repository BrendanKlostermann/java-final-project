package src.final_assignment;
import java.lang.Integer;

public class vehicle implements Comparable<vehicle>{
    private String make;
    private String model;
    private String year;

    public vehicle(){
        make = "";
        model = "";
        year = "";
    }

    public vehicle(String make, String model, String year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Make methods get set validate
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        validateMake(make);
        this.make = make;
    }

    private void validateMake(String make){
        if(make.equals("") || make == null){
            throw new IllegalArgumentException("Vehicle Make is required");
        }
    } // end of make


    // Model methods get set validate
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        validateModel(model);
        this.model = model;
    }

    private void validateModel(String model){
        if(model.equals("") || model == null){
            throw new IllegalArgumentException("Vehicle Model is required");
        }
    }

    // Year methods Get Set Validate

    public String getYear(){
        return year;
    }

    public void setYear(String year){
        validateYear(year);
        this.year = year;
    }

    private void validateYear(String year){
        if(year.length() != 4){
            try {
                int test = Integer.parseInt(year);             
            } catch (Exception e) {
                throw new IllegalArgumentException("Vehicle year is required to be in 4 digit style");
            }
            
        }
    }




    //to String
    
    public String toString(String make, String model, String year){
        return String.format("Make: %s\n Model: %s\n Year: %si",make,model,year);
    }


    //compare to
    @Override
    public int compareTo(vehicle other) {
        int result = this.make.compareTo(other.make);
        if(result == 0){
            result = this.model.compareTo(other.model);
        }
        return result;
    }


}
