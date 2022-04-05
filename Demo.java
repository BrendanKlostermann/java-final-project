import java.math.BigInteger;
import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        // non-class data types
        boolean likesPizza = true;
        boolean hatesCats = false; // boolean can only be true or false
        boolean needsCaffine = true;

        byte x = Byte.MAX_VALUE; // 8-bit integar between -128 and 127
        byte xx = Byte.MIN_VALUE;
        System.out.println(xx);
        System.out.println(x);

        char y = 'c'; // Character, it can only store a single character, can also be an ASCII value

        short b = Short.MAX_VALUE; // short integar 16-bit
        short bb = Short.MIN_VALUE;
        System.out.println(b + " to " + bb);

        int age = 40; // integar

        long a = 9999999999L; // long integar
        System.out.println(a);

        float z = 0; // single-precision floating point

        double heightInInches = 75.2; // double-precision floating point

        BigInteger aaa = new BigInteger("9999999999");
        BigInteger bbb = new BigInteger("9999999999");
        System.out.println(aaa.multiply(bbb));
        // class data types

        String name = "Brendan";
        
        System.out.println(Math.floor(Math.random()*(7 - 1) + 1));
        System.out.println("One\nTwo\nThree");
}
}

    