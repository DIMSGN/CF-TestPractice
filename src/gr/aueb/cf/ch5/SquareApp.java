package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Squares the number that user gives.
 */

public class SquareApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num;

        System.out.print("Παρακαλώ εισάγετε έναν αριθμό: ");
        num = scanner.nextInt();
        System.out.printf("Το τετράγωνο του %d είναι %d", num, square(num));

    }

    /**
     *
     * @param num the input number that we want to calculate the square.
     * @return the square of the num.
     */
    public static int square(int num) {
        return num * num;
    }
}
