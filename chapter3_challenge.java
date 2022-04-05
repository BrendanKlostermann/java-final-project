import java.util.Scanner;

public class chapter3_challenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double farthest_north = Double.MIN_VALUE;
        double farthest_south = Double.MAX_VALUE;
        double farthest_east = Double.MIN_VALUE;
        double farthest_west = Double.MAX_VALUE;
        double input_latitude = 0;
        double input_longitude = 0;
        String keep_going;

        while (true) {

            input_latitude = InputUtility.getDouble("Please enter a Latitude", scanner);
            if (input_latitude < -90.0 || input_latitude > 90.0) {
                System.out.println("Invalid lattitude");
                continue;
            }

            input_longitude = InputUtility.getDouble("Please enter a Longitude", scanner);
            if (input_longitude < -180.0 || input_longitude > 180.0) {
                System.out.println("Invalid longitude");
                continue;
            }

            if (input_latitude > farthest_north) {
                farthest_north = input_latitude;
            }
            if (input_latitude < farthest_south) {
                farthest_south = input_latitude;
            }
            if (input_longitude > farthest_east) {
                farthest_east = input_longitude;
            }
            if (input_longitude < farthest_west) {
                farthest_west = input_longitude;
            }

            keep_going = InputUtility.validateUserString("Add another longitude and latitude? ",
                    new String[] { "Yes", "No" }, scanner);
            if (keep_going.equals("No") || keep_going.equals("no")) {
                break;
            }
        }
        System.out.println("Farthest North: " + farthest_north);
        System.out.println("Farthest South: " + farthest_south);
        System.out.println("Farthest East: " + farthest_east);
        System.out.println("Farthest West: " + farthest_west);

    }

}
