package gr.aueb.cf.ch4;

public class ForExamples {
    public static void main(String[] args) {
        // Test the count method with various inputs
        System.out.println("count(0): " + count(0));    // Expected: 0
        System.out.println("count(1): " + count(1));    // Expected: 0
        System.out.println("count(2): " + count(2));    // Expected: 1
        System.out.println("count(5): " + count(5));    // Expected: 2
        System.out.println("count(6): " + count(6));    // Expected: 3
        System.out.println("count(-3): " + count(-3));  // Expected: 0
    }

    public static int count(int a) {
        int counter = 0;
        for (int i = 1; i <= a; i++) {
            if ((i % 2) == 0) counter++;
        }
        return counter;
    }
}
