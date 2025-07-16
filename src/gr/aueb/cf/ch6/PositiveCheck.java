package gr.aueb.cf.ch6;

/**
 * Περιέχει μεθόδους για έλεγχο θετικών αριθμών σε πίνακα.
 */
public class PositiveCheck {
    public static void main(String[] args) {
        int[] arr = {-8, -9, -1, -3, 12, 5};
        boolean checkForOne = atLeastOnePositive(arr);
        boolean checkForAll = allPositive(arr);

        System.out.println(checkForOne);
        System.out.println(checkForAll);
    }
    /**
     * Ελέγχει αν υπάρχει τουλάχιστον ένας θετικός αριθμός στον πίνακα.
     * @param arr Ο πίνακας προς έλεγχο
     * @return true αν υπάρχει έστω ένας θετικός αριθμός, αλλιώς false
     */
    public static boolean atLeastOnePositive(int[] arr) {
        for (int num : arr) {
            if (num > 0) return true;
        }
        return false;
    }
    /**
     * Ελέγχει αν όλοι οι αριθμοί του πίνακα είναι θετικοί.
     * @param arr Ο πίνακας προς έλεγχο.
     * @return false αν βρεθεί αρνητικός αριθμός. Αλλιώς true.
     */
    public static boolean allPositive(int[] arr) {
        for (int num : arr) {
            if (num < 0) return false;
        }
        return true;
    }
}
