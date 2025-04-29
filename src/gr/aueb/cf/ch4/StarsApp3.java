package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει δυο ακέραιους από τον χρήστη
 * και εκτυπώνει ενα κουτί με αστεράκια με βάση τις επιλογές του χρήστη.
 */
public class StarsApp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numHorizontalStars;
        int numVerticalStars;

        System.out.print("Παρακαλώ εισάγετε το πλήθος του οριζοντίων '*' για εκτύπωση: ");
        numHorizontalStars = scanner.nextInt();
        System.out.print("Παρακαλώ εισάγετε το πλήθος του κάθετων '*' για εκτύπωση: ");
        numVerticalStars = scanner.nextInt();

        for (int i = 1; i <= numHorizontalStars; i++) {
            for (int j = 1; j <= numVerticalStars; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        scanner.close();
    }
}
