import java.util.ArrayList;
import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("==== Train Consist Management App ====");
        System.out.println("==== UC2 - Add Passenger Bogies to Train ====\n");

        List<String> passengerBogies = new ArrayList<>();


        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");


        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);


        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);


        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + hasSleeper);


        System.out.println("\nFinal Train Passenger Consist: " + passengerBogies);
        System.out.println("UC2 operations completed successfully ...");
    }
}