package gr.aueb.cf.ch4;

/**
 * Βρίσκει το άθροισμα των ακεραίων από 1 έως 50.
 */

public class PrintSum50 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 50; i++){
            result = result + i;
        }
        System.out.printf("Το άθροισμα των ακεραίων από 1 έως 50 είναι %d", result);
    }
}
