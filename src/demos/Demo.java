package src.demos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// import java.math.BigInteger;
// import java.util.Random;

public class Demo {

    public static void main(String[] args) {
    //     // non-class data types
    //     boolean likesPizza = true;
    //     boolean hatesCats = false; // boolean can only be true or false
    //     boolean needsCaffine = true;

    //     byte x = Byte.MAX_VALUE; // 8-bit integar between -128 and 127
    //     byte xx = Byte.MIN_VALUE;
    //     System.out.println(xx);
    //     System.out.println(x);

    //     char y = 'c'; // Character, it can only store a single character, can also be an ASCII value

    //     short b = Short.MAX_VALUE; // short integar 16-bit
    //     short bb = Short.MIN_VALUE;
    //     System.out.println(b + " to " + bb);

    //     int age = 40; // integar

    //     // long a = 9999999999L; // long integar
    //     // System.out.println(a);

    //     float z = 0; // single-precision floating point

    //     double heightInInches = 75.2; // double-precision floating point

    //     BigInteger aaa = new BigInteger("9999999999");
    //     BigInteger bbb = new BigInteger("9999999999");
    //     System.out.println(aaa.multiply(bbb));
    //     // class data types

    //     String name = "Brendan";
        
    //     System.out.println(Math.floor(Math.random()*(7 - 1) + 1));
    //     System.out.println("One\nTwo\nThree");

    //     int result = 0;
    //         for(int k = 10; k > 0; k = k - 2) {
    //             result += k;
    //         }System.out.println(result);


    //     String school = "Kirkwood";
    //     String tabs = "";
    //     String upperSchool = school.toUpperCase();
    //     for(int i = 0; i < school.length(); i++){
    //         System.out.println(tabs + upperSchool.charAt(i));
    //         tabs = tabs + "\t";

    String[] months = new String[12];
    months[0] = "Jan";
    months[1] = "Feb";
    months[2] = "Mar";
    months[11] = "Dec";

    for(String month : months){ //foreach loop
        System.out.println(month);
    }
    System.out.println();

    // String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed"};

    List<String> petNames = new ArrayList<>();
    petNames.add("Zipper");
    petNames.add("Waffles");
    petNames.add("Muffin");

    for(String pet : petNames){
        System.out.println(pet);
    }
    System.out.println();

    for(int i = 0; i < months.length; i++){
        System.out.println(months[i]);
    }
    System.out.println();

    System.out.println(Arrays.toString(months));
    System.out.println();

    Integer[] lottoNumbers = new Integer[6];
    lottoNumbers[0] = 14;
    lottoNumbers[1] = 39;
    lottoNumbers[2] = 54;
    lottoNumbers[3] = 21;
    lottoNumbers[4] = 65;
    lottoNumbers[5] = 17;
    // lottoNumbers[2] = lottoNumbers[4] + lottoNumbers[5];

    

    System.out.println(Arrays.toString(lottoNumbers));
    System.out.println();

        }
    
    }




    