import java.io.IOException;
import java.util.*;

public class demo2 {
    public static void main(String[] args) throws IOException{
        String[] months = new String[12];
        months[0] = "Jan";
        months[1] = "Feb";
        months[2] = "Mar";
        months[11] = "Dec";

        for(String month : months){ //foreach loop
            System.out.println(month);
        }
        System.out.println();

        String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed"};

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
