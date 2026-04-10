import java.util.*;

public class TrainConsistManagementApp {

    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        String shape;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                if (shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }
                System.out.println("Cargo assigned successfully -> " + cargo);
                System.out.println("Cargo validation completed for " + shape + " bogie");
            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Cargo validation completed for " + shape + " bogie");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=============================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("=============================\n");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        b1.assignCargo("Petroleum");
        System.out.println();

        b2.assignCargo("Petroleum");
        System.out.println();

        System.out.println("UC15 runtime handling completed...");
    }
}