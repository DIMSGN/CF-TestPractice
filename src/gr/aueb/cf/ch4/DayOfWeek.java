package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Δέχεται έναν ακέραιο (1-7) και
 * επιστρέφει το αντίστοιχο όνομα της ημέρας της εβδομάδας (π.χ., 1
 * → "Δευτέρα").

 */

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.print("Παρακαλώ εισάγετε έναν ακέραιο απο το 1 ως το 7 : ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Επιλέξατε : ");
                System.out.println("Δευτέρα");
            }
            case 2 -> System.out.println("Τρίτη");
            case 3 -> System.out.println("Τετάρτη");
            case 4 -> System.out.println("Πέμπτη");
            case 5 -> System.out.println("Παρασκευή");
            case 6 -> System.out.println("Σάββατο");
            case 7 -> System.out.println("Κυριακή");
        }
    }
}
