package gr.aueb.cf.ch6;

/**
 * Η κλάση GetMaxPosition παρέχει βοηθητικές μεθόδους
 * για την εύρεση της θέσης του μέγιστου και του ελάχιστου στοιχείου
 * μέσα σε έναν πίνακα ακέραιων αριθμών.
 */
public class GetMaxPosition {

    public static void main(String[] args) {
        int[] arr = {4, 9, 1, 3, 12, 5};
        int maxPos = getMaxPosition(arr, 0, arr.length - 1);
        int minPos = getMinPosition(arr, 0, arr.length - 1);
        System.out.println("Μικρότερο στοιχείο: " + arr[minPos] + " στη θέση : " + minPos);
        System.out.println("Mεγαλύτερο στοιχείο: " + arr[maxPos] + " στη θέση: " + maxPos);
    }

    /**
     * Επιστρέφει τη θέση του μέγιστου στοιχείου μέσα στον
     * πίνακα από τη θέση low έως και τη θέση high.
     *
     * @param arr ο πίνακας ακεραίων αριθμών.
     * @param low η αρχική θέση (inclusive) για την αναζήτηση.
     * @param high η τελική θέση (inclusive) για την αναζήτηση.
     * @return η θέση του μέγιστου στοιχείου.
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = low;

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > arr[maxPosition]) {
                maxPosition = i;
            }
        }
        return maxPosition;
    }

    /**
     * Επιστρέφει τη θέση του ελάχιστου στοιχείου μέσα στον
     * πίνακα από τη θέση low έως και τη θέση high.
     *
     * @param arr ο πίνακας ακεραίων αριθμών.
     * @param low η αρχική θέση (inclusive) για την αναζήτηση.
     * @param high η τελική θέση (inclusive) για την αναζήτηση.
     * @return η θέση του ελάχιστου στοιχείου.
     */
    public static int getMinPosition(int[] arr, int low, int high) {
        int minPosition = low;

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] < arr[minPosition]) {
                minPosition = i;
            }
        }
        return minPosition;
    }
}
