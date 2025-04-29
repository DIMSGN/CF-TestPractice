package gr.aueb.cf.ch4;

import java.util.Scanner;
/**
 * Διαβάζει έναν ακέραιο από τον χρήστη
 * και εκτυπώνει τόσα κάθετα αστεράκια.
 */
public class StarsApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStars;

        System.out.print("Παρακαλώ εισάγετε το πλήθος των '*' για εκτύπωση: ");
        numStars = scanner.nextInt();

        for (int i = 1; i <= numStars; i++) {
            System.out.println('*');
        }
        System.out.println();
    }
}
