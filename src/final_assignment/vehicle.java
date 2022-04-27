package src.final_assignment;

import java.lang.Integer;

public class Vehicle implements Comparable<Vehicle>{
    private String make;
    private String model;
    private String year;
    private String color;
    private String bodyStyle;

    public Vehicle() {
        make = "";
        model = "";
        year = "";
        color = "";
        bodyStyle = "";
    }

    public Vehicle(String make, String model, String year, String color, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.bodyStyle = bodyStyle;
    }

    // Make methods get set validate
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        validateMake(make);
        this.make = make;
    }

    private void validateMake(String make) {
        if (make.equals("") || make == null) {
            throw new IllegalArgumentException("Vehicle Make is required");
        }
    } // end of make

    // Model methods get set validate
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        validateModel(model);
        this.model = model;
    }

    private void validateModel(String model) {
        if (model.equals("") || model == null) {
            throw new IllegalArgumentException("Vehicle Model is required");
        }
    } // end od model

    // Year methods Get Set Validate

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        validateYear(year);
        this.year = year;
    }

    private void validateYear(String year) {
        if (year.length() != 4) {
            try {
                int test = Integer.parseInt(year);
            } catch (Exception e) {
                throw new IllegalArgumentException("Vehicle year is required to be in 4 digit style");
            }

        }
    } // end of year

    // Color methods Get Set Validate

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        validateColor(color);
        this.color = color;
    }

    private void validateColor(String color) {
        if (color.equals("") || color == null) {
            throw new IllegalArgumentException("Vehicle Color is required");
        }
    } // end of color

    // BodyStyle methods Get Set Validate

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        validateBodyStyle(bodyStyle);
        this.bodyStyle = bodyStyle;
    }

    private void validateBodyStyle(String bodyStyle) {
        if (bodyStyle.equals("") || bodyStyle == null) {
            throw new IllegalArgumentException("Vehicle Color is required");
        }
    } // end of bodyStyle

    // to String

    public String toString(String make, String model, String year) {
        return String.format("Make: %s\n Model: %s\n Year: %s\n Color: %s\n BodyStyle: %s", make, model, year, color,
                bodyStyle);
    }

    // compare to
    @Override
    public int compareTo(Vehicle other) {
        int result = this.make.compareTo(other.make);
        if (result == 0) {
            result = this.model.compareTo(other.model);
        }
        return result;
    }

    
}
