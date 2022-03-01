import java.io.IOException;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) throws IOException{
        char ch = (char) System.in.read();
        if(ch > 90 && ch < 122){
            ch = (char)(ch -32);
            System.out.println(ch);
        }
        else if(ch < 97 && ch > 65){
            ch = (char)(ch + 32);
            System.out.println(ch);
        }
        else{
            System.out.println("Error");
        }
    }
}
