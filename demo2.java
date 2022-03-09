import java.io.IOException;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) throws IOException{
        for(int i = 1; i <= 100; i++)
        if((i % 3 == 0) && (i % 5 == 0))
        {
            System.out.println("FizzBuzz");
        } else if(i % 5 == 0)
        {
            System.out.println("Buzz");
        } else if(i % 3 == 0)
        {
            System.out.println("Fizz");
        } else {
            System.out.println(i);
        }
    }
}
