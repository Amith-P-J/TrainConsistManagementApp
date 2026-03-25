import java.util.ArrayList;
import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("==== Train Consist Management App ====");
        System.out.println("=================================================================\n");
        System.out.println("==== UC5 - Preserve Insertion Order of Bogies (LinkedHashSet) ====\n");
        System.out.println("=================================================================\n");

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        boolean isDuplicateAdded = formation.add("Sleeper");

        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("Note: \nLinkedHashSet preserves insertion order and removes duplicates automatically.\n\n");
        System.out.println("UC5 formation setup completed ...\n");
    }
}

