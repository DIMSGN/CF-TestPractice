package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει δύο ακεραίους και έναν τελεστή (+, -, *, /) από τον χρήστη,
 * εκτελεί την αντίστοιχη πράξη και εμφανίζει το αποτέλεσμα.
 * Υλοποιείται με τη χρήση της νέας σύνταξης switch/case.
 */
public class SimpleCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        char operator;

        System.out.print("Εισάγετε δύο ακεραίους και έναν τελεστή (+, -, *, /): ");
        num1 = scanner.nextInt();
        operator = scanner.next().charAt(0);
        num2 = scanner.nextInt();


        switch (operator) {
            case '+' -> System.out.println("Αποτέλεσμα: " + (num1 + num2));
            case '-' -> System.out.println("Αποτέλεσμα: " + (num1 - num2));
            case '*' -> System.out.println("Αποτέλεσμα: " + (num1 * num2));
            case '/' -> {
                if (num2 != 0) {
                    System.out.printf("Αποτέλεσμα: %d%n", num1 / num2);
                }
                System.out.println("Σφάλμα: Διαίρεση με μηδέν.");

            }
            default -> System.out.println("Μη έγκυρος τελεστής.");
        }

        scanner.close();
    }
}