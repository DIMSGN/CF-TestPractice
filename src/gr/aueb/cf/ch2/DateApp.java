package gr.aueb.cf.ch2;

import java.util.Scanner;
/**
 * Διαβάζει από τον χρήστη ημέρα,
 * μήνα και έτος και τα εμφανίζει σε μορφή ΗΗ/ΜΜ/ΕΕ.
 * Για παράδειγμα, αν δοθούν οι αριθμοί 5 12 2022, θα εμφανιστεί ως 05/12/22.
 */
public class DateApp {
    public static void main(String[] args) {

        //declarations
        int day = 0;
        int month = 0;
        int year = 0;
        Scanner scanner = new Scanner(System.in);

        // input from the user
        System.out.print("Eισάγετε ημερομηνία (πχ 4 13 2025) : ");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();

        //Print the expected result
        System.out.printf("Η ημερομηνία είναι : %02d/%02d/%d", day, month, year);
    }
}
