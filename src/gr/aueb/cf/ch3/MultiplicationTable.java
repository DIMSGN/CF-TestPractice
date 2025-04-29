package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρηστής δίνει ενα ακέραιο απο 1-10
 * και υπολογίζεται ο πολλαπλασιασμοί
 * του ακεραίου με όλους τους ακεραίους απο 1-10.
 * Για παράδειγμα, αν χρήστης δώσει 5
 * τότε ως output αναμένουμε να πάρουμε
 * 5 * 1 = 5
 * 5 * 2 = 5
 * ...
 * 5 * 10 = 5
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        //declare
        int userInput = 0;
        int i = 1;
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        //commands and user input
        System.out.print("Παρακαλώ εισάγετε ενα αριθμό απο το 1-10 ");
        userInput = scanner.nextInt();

        while (i <= 10) {
            result = i * userInput;
            System.out.printf("%d * %d = %d\n", i, userInput, result);
            i++;
        }
    }
}
