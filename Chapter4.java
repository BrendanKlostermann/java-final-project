import java.math.BigInteger;
import java.util.Scanner;

public class Chapter4 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 4 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "Exercise 1", "Exercise 2", "Exercise 3", "Exercise 4","Exercise 5", "Exercise 6", "Exercise 7", "Exercise 8"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    exercise1(in);
                    break;
                case 2:
                    exercise2(in);
                    break;
                case 3:
                    exercise3(in);
                    break;
                case 4:
                    exercise4(in);
                    break;
                case 5:
                    exercise5(in);
                    break;
                case 6:
                    exercise6(in);
                    break;
                case 7:
                    exercise7(in);
                    break;
                case 8:
                    exercise8(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 4 Menu.");
    }



    public class Fraction{
        private int numerator;
        private int denominator;

        public Fraction(){
            numerator = 1;
            denominator = 1;
        }

        public Fraction(int x, int y){
            validateDenominator(y);
            this.numerator = x;
            this.denominator = y;
        }

        public int getNumerator(){
            return numerator;
        }

        public void setNumerator(int numerator){
            this.numerator = numerator;
        }

        public int getDenominator(){
            return denominator;
        }

        public void setDonminator(int denominator){
            validateDenominator(denominator);
            this.denominator = denominator;
        }

        public String toString(){
                return numerator + "/" + denominator;
        }

        private void validateDenominator(int denominator){
            if(denominator==0){
                throw new IllegalArgumentException("Denominator can not be 0.");
            }
        }

        public static int greatestCommonDivisor(int num1, int num2){
            BigInteger b1 = BigInteger.valueOf(num1);
            BigInteger b2 = BigInteger.valueOf(num2);
            BigInteger gcd = b1.gcd(b2);
            return gcd.intValue();
        }

        public Fraction simplify(){
            int gdc = Fraction.greatestCommonDivisor(this.numerator, this.denominator);
            Fraction fraction = new Fraction(numerator/gdc, (denominator/gdc));
            if((fraction.getNumerator() >= 0 && fraction.getDenominator() < 0) || (fraction.getNumerator() < 0 && fraction.getDenominator() < 0)){
                fraction.setNumerator(fraction.getNumerator()*-1);
                fraction.setDonminator(fraction.getDenominator()*-1);
            }
            
            return fraction;
        }

        public String mixedNumber(){
            
            return "";
        }

    }



    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");
        Fraction fraction = new Fraction();
        System.out.println(fraction.toString());

       
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");
        
        Fraction fraction = new Fraction(27, 6);
        System.out.println(fraction.toString());
        System.out.println(fraction.getNumerator());
        System.out.println(fraction.getDenominator());
        fraction.setNumerator(30);
        fraction.setDonminator(45);
        System.out.println(fraction.toString());

        
    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        
        try {
            Fraction fraction = new Fraction(3, 0);
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
        Fraction fraction2 = new Fraction();
        try {
            fraction2.setDonminator(0);
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
       

    }

    public void exercise4(Scanner in) {
        UIUtility.showMenuTitle("exercise 4");
        System.out.println(Fraction.greatestCommonDivisor(75, 45));
        System.out.println(Fraction.greatestCommonDivisor(2, 4));
        System.out.println(Fraction.greatestCommonDivisor(5, 7));

        
    }

    public void exercise5(Scanner in) {
        UIUtility.showMenuTitle("exercise 5");

        Fraction fraction = new Fraction(75, 45);
        System.out.println(fraction.simplify());

        Fraction fraction2 = new Fraction(2,4);
        System.out.println(fraction2.simplify());

        Fraction fraction3 = new Fraction(5, 7);
        System.out.println(fraction3.simplify());

        Fraction fraction4 = new Fraction(-2, 4);
        System.out.println(fraction4.simplify());

        Fraction fraction5 = new Fraction(2, -4);
        System.out.println(fraction5.simplify());

        Fraction fraction6 = new Fraction(-2, -4);
        System.out.println(fraction6.simplify());

        
    }

    public void exercise6(Scanner in) {
        UIUtility.showMenuTitle("exercise 6");
        // Your code here

        
    }

    public void exercise7(Scanner in) {
        UIUtility.showMenuTitle("exercise 7");
        // Your code here

        
    }

    public void exercise8(Scanner in) {
        UIUtility.showMenuTitle("exercise 8");
        // Your code here

        
    }
}