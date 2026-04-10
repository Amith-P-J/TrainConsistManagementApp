import java.util.*;
import java.util.regex.*;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println(" UC11 - Validate Train ID and Cargo Code ");
        System.out.println("===========================================\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = sc.nextLine();
        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = sc.nextLine();
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");
        boolean isTrainValid = trainPattern.matcher(trainId).matches();
        boolean isCargoValid = cargoPattern.matcher(cargoCode).matches();
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainValid);
        System.out.println("Cargo Code Valid: " + isCargoValid);
        System.out.println("\nUC11 validation completed...");
    }
}