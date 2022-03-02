import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class demo3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your birthday [YYYY-MM-DD]: ");
        String birthday = scan.nextLine();
        scan.close();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate realBirthday = LocalDate.parse(birthday, formatter);
        Month month = realBirthday.getMonth();
        int monthInt = realBirthday.getMonthValue();
        int day = realBirthday.getDayOfMonth();
        String stringMonth = month.getDisplayName(TextStyle.FULL, Locale.getDefault());
        // String monthDay = stringMonth + " " + day;
        if((stringMonth == "March" && day >= 21) && (stringMonth == "April" && day <= 19))
            {System.out.println(stringMonth + " " + day);
                System.out.println("Aries");}
        else if ((stringMonth == "April" && day >= 20) && (stringMonth == "May" && day <= 20))
            {System.out.println(stringMonth + " " + day);
                System.out.println("Taurus");}
        else if ((stringMonth == "May" && day >= 21) && (stringMonth == "June" && day <= 20))
            {System.out.println(stringMonth + " " + day);
                System.out.println("Gemini");}
        else if ((stringMonth == "June" && day >= 21) && (stringMonth == "July" && day <= 22))
            {System.out.println(stringMonth + " " + day);
                System.out.println("Cancer");}
        else if ((stringMonth == "July" && day >= 23) && (stringMonth == "August" && day <= 22))
            {System.out.println(stringMonth + " " + day);
                System.out.println("Leo");}
        else if ((stringMonth == "August" && day >= 23) && (stringMonth == "September" && day <= 22))
            {System.out.println(stringMonth + " " + day);
                System.out.println("Virgo");}
        else if ((stringMonth == "September" && day >= 23) && (stringMonth == "October" && day <= 22))
            {System.out.println(stringMonth + " " + day);
                System.out.println("Libra");}
        else if ((monthInt == 10 && day >= 23) && (monthInt == 11 && day <= 21))
            {System.out.println(stringMonth + " " + day);
                System.out.println("Scorpio");}
        else if ((stringMonth == "November" && day >= 22) && (stringMonth == "December" && day <=  21))
            {System.out.println(stringMonth + " " + day);
                System.out.println("Sagittarius");}
        else if ((stringMonth == "December" && day >= 22) && (stringMonth == "January" && day <= 19))
            {System.out.println(stringMonth + " " + day);
                System.out.println("Capricorn");}
        else if ((stringMonth == "January" && day >= 20) && (stringMonth == "February" && day <= 18))
            {System.out.println(stringMonth + " " + day);
                System.out.println("Aquarius");}
        else {System.out.println(stringMonth + " " + day);
            System.out.println("Pisces");}

    }
}
