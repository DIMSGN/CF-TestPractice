package gr.aueb.cf.ch6;

/**
 * 3. Mapping κάθε στοιχείου του πίνακα με το διπλάσιο (η μέθοδος
 * επιστρέφει πίνακα)
 */

public class ArrayMapping {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] doubled = mapToDouble(original);

        for (int el : doubled) {
            System.out.println(el + " ");
        }
    }

    public static int[] mapToDouble(int[] arr) {
        int[] doubled = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            doubled[i] = arr[i] * 2;
        }
    return doubled;
    }
}
