import java.util.*;
public class TrainConsistManagementApp {
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams) ");
        System.out.println("================================================\n");
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Type" + i, i % 100));
        }
        long startLoop = System.nanoTime();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
            }
        }
        long endLoop = System.nanoTime();
        long startStream = System.nanoTime();
        bogies.stream().filter(b -> b.capacity > 60).toList();
        long endStream = System.nanoTime();
        System.out.println("Loop Execution Time (ns): " + (endLoop - startLoop));
        System.out.println("Stream Execution Time (ns): " + (endStream - startStream));
        System.out.println("\nUC13 performance benchmarking completed...");
    }
}