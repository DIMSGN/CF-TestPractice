package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Για κάθε επιλογή από 1 – 4 εμφανίζεται feedback, για παράδειγμα αν ο χρήστης
 * δώσει 1, θα εμφανίζεται το μήνυμα <Επιλέξατε Εισαγωγή>.
 * Θα πρέπει επίσης να ελέγχετε αν ο χρήστης δώσει αριθμό
 * < 0 ή > 5 και να δίνετε κατάλληλο μήνυμα.
 * 1. Εισαγωγή
 * 2. Διαγραφή
 * 3. Ενημέρωση
 * 4. Αναζήτηση
 * 5. Έξοδος
 */

public class UserMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            System.out.print("Δώστε την επιλογή σας: ");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if (choice == 5) {
                System.out.println("Έξοδος...");
                System.out.println("Ευχαριστούμε");
            } else {
                System.out.println("Λάθος επιλογή! Παρακαλώ επιλέξτε 1-5.");
            }

        } while (choice != 5);
    }
}