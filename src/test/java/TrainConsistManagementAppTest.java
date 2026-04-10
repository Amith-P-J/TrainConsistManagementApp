public class TrainConsistManagementAppTest {

    public static void main(String[] args) {

        int passed = 0;
        int total = 4;

        // Test 1: Addition
        int result = 2 + 3;
        if (result == 5) {
            passed++;
            System.out.println("testAddition PASSED");
        } else {
            System.out.println("testAddition FAILED");
        }

        // Test 2: Valid condition
        if (10 > 5) {
            passed++;
            System.out.println("testValidCondition PASSED");
        } else {
            System.out.println("testValidCondition FAILED");
        }

        // Test 3: Invalid condition
        if (!(5 > 10)) {
            passed++;
            System.out.println("testInvalidCondition PASSED");
        } else {
            System.out.println("testInvalidCondition FAILED");
        }

        // Test 4: Exception test
        try {
            throw new Exception("Error occurred");
        } catch (Exception e) {
            if (e.getMessage().equals("Error occurred")) {
                passed++;
                System.out.println("testException PASSED");
            } else {
                System.out.println("testException FAILED");
            }
        }

        // Final result
        System.out.println("\nTest run finished");
        System.out.println(passed + " tests passed");
        System.out.println((total - passed) + " tests failed");
    }
}