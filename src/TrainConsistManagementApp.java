import java.util.ArrayList;
import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("==== Train Consist Management App ====");
        System.out.println("==============================================\n");
        System.out.println("==== UC3 - Track Unique Bogie IDs ====\n");
        System.out.println("==============================================\n");


        Set<String> bogies = new HashSet<>();

        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");


        bogies.add("BG101");
        bogies.add("BG102");


        System.out.println("\nBogie IDs After Insertion:");
        System.out.println(bogies);

        System.out.println("\nNote: \nDuplicates were automatically ignored by HashSet.");


        System.out.println("\nUC3 uniqueness validation completed successfully...");
    }
}