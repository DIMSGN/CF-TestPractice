package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει το πλήθος των stars
 * που θα έχει η τελευταία γραμμή,
 * και εκτυπώνει γραμμές μέχρι να φτάσει τον αριθμό αυτό.
 */
public class StarsApp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStars;

        System.out.print("Παρακαλώ εισάγετε το πλήθος των '*' για εκτύπωση: ");
        numStars = scanner.nextInt();

        for (int i = 1; i <= numStars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        scanner.close();
    }
}
