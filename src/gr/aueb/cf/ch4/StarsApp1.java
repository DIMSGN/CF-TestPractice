package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει το πλήθος των stars, έστω n οριζόντια αστεράκια εμφανίζονται οριζόντια.
 */
public class StarsApp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStars;

        System.out.print("Παρακαλώ εισάγετε το πλήθος των '*' για εκτύπωση: ");
        numStars = scanner.nextInt();

        for (int i = 1; i <= numStars; i++) {
            System.out.print('*');
        }
        System.out.println();
        scanner.close();
    }
}
