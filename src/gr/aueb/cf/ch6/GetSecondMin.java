package gr.aueb.cf.ch6;

/**
 * Βρίσκει το ευρετήριο του 2ου μικρότερου στοιχείου ενός πίνακα.
 */
public class GetSecondMin {

    public static void main(String[] args) {
        int[] arr = {4, 9, 1, 3, 12, 5};
        int secondMinIndex = findSecondMinIndex(arr);

        if (secondMinIndex == -1) {
            System.out.println("Δεν υπάρχει δεύτερο μικρότερο στοιχείο.");
        }
        System.out.println("2ο μικρότερο στοιχείο: " + arr[secondMinIndex] + " στη θέση: " + secondMinIndex);
    }

    /**
     * Επιστρέφει τη θέση του δεύτερου μικρότερου στοιχείου του πίνακα.
     * Εάν δεν υπάρχει δεύτερο μικρότερο (π.χ., όλα τα στοιχεία είναι ίδια), επιστρέφει -1.
     */
    public static int findSecondMinIndex(int[] arr) {
        if (arr.length < 2) return -1;

        int minIndex = 0;
        int secondMinIndex = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                secondMinIndex = minIndex;
                minIndex = i;
            } else if ((secondMinIndex == -1 || arr[i] < arr[secondMinIndex]) && arr[i] != arr[minIndex]) {
                secondMinIndex = i;
            }
        }
        return secondMinIndex;
    }
}