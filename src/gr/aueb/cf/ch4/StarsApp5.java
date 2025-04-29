package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει το πλήθος των stars
 * που θα εκτυπώνεται στην πρώτη γραμμή,
 * και θα μειώνεται κατά ένα σε κάθε γραμμή.
 */
public class StarsApp5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStars;

        System.out.print("Παρακαλώ εισάγετε το πλήθος των '*' για εκτύπωση: ");
        numStars = scanner.nextInt();

        for (int i = 1; i <= numStars; i++) {
            for (int j = i; j <= numStars; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        scanner.close();
    }
}
