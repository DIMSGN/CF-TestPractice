package gr.aueb.cf.ch6;

/**
 * 2. Φιλτράρισμα των ζυγών (επιστρέφει void, μόνο εκτύπωση των
 * ζυγών)
 */


public class PrintEven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printEven(arr);
    }

    /**
     * Εκτυπώνει τους ζυγούς αριθμούς ενός πίνακα.
     *
     * @param arr Ο πίνακας που ελέγχεται.
     */
    public static void printEven(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}