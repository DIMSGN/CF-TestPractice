package gr.aueb.cf.ch6;

/**
 * Αναζήτηση ενός στοιχείου στον πίνακα (Επιστρέφει τη θέση
 * του στοιχείου)
*/

public class ArraySearch {

    public static void main(String[] args) {
        int position;
        int value = 3;
        int[] arr = {1, 2, 3, 4, 5};
        position = getPosition(arr, value);

        if (position == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found on position " + (position + 1));
        }
    }

    /**
     * Διασχίζει έναν πίνακα αναζητώντας ενα στοιχειό.
     * Αν βρεθεί το στοιχειό στον πίνακα τότε εκχωρείται στη μεταβλητή positionToReturn η θέση του στοιχειού.
     * @param arr ο πίνακας που χρησιμοποιούμε
     * @param value το στοιχειό που θα αναζητήσουμε
     * @return επιστρέφει τη θέση.
     */
    public static int getPosition(int[] arr, int value) {
        int positionToReturn = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
