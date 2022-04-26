package src.demos;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Donation{ // we use classes because they are reusable
    // instance variables (fields)
    double amount;
    String name;
    boolean annonymousAmount;
    boolean annonymousName;
    String note;
    LocalDate dateDonated;
    static int totalDonations = 0;

    

    //contructor
    
    // methods   methods are functions
    String daysAgo() {
        LocalDate today = LocalDate.now();

        int days = (int)ChronoUnit.DAYS.between(dateDonated, today);
        String dayWord = days == 1 ? " day" : " days";
        return ("This donation was made " + days + dayWord + " ago.");
    }

    static void addDonation(double amount){ //parameters are values that are passed into the method
        totalDonations += amount;
    }

    static double getTotalDonations() {

        return totalDonations;
    }


}


public class DonationDemo {
    public static void main(String[] args) {
        int number = 5; // assigning values to variables
        int number2 = number;
        number++;
        System.out.println(number);
        System.out.println(number2);


        Donation donation = new Donation(); //instanciate an object, creates a refernce to the class containing the fields
        donation.amount = 50; //assigning values to variables using the object name, not the class name.
        donation.annonymousAmount = false;
        donation.name = "Brendan";
        donation.annonymousName = false;
        donation.note = "In rememberance of my dog Sam.";
        donation.dateDonated = LocalDate.now();
        Donation.addDonation(donation.amount);

        System.out.printf("Thank you %s for your donation of $%,.2f!\n", donation.name, donation.amount);

        Donation donation2 = new Donation(); //instanciate an object
        donation2.amount = 100000;
        donation2.annonymousAmount = true;
        donation2.name = "Charles";
        donation2.annonymousName = true;
        donation2.note = "For my cat lemme";
        donation2.dateDonated = LocalDate.of(2022, 3, 14);
        Donation.addDonation(donation2.amount); //this is an arguement for the method that was called

        System.out.printf("Thank you %s for your donation of $%,.2f!\n", donation2.name, donation2.amount);
        System.out.println(donation2.daysAgo());
        System.out.println(Donation.getTotalDonations());
    }

}
