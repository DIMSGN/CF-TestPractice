package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ενεργοποιεί τη θέρμανση αν:
 * - Η θερμοκρασία (temp) < 18 **ή**
 * - Η υγρασία (humidity) > 70% **και** ταυτόχρονα ο χρήστης ζητά θέρμανση (userRequest).
 * Αν η θέρμανση είναι ήδη ανοιχτή (isHeaterOn), αγνοεί τις συνθήκες.
 */

public class TempApp {
    public static void main(String[] args) {
        // declarations
        int temp = 0;
        int humidity = 0;
        boolean isHeaterOn = false;
        boolean openHeater = false;
        boolean userRequest = false;
        Scanner scanner = new Scanner(System.in);

        // commands and user input
        System.out.print("Παρακαλώ εισάγετε θερμοκρασία : ");
        temp = scanner.nextInt();
        System.out.print("Παρακαλώ εισάγετε ποσοστό υγρασίας(%) :");
        humidity = scanner.nextInt();
        System.out.print("Θα θέλατε να ανοίξετε την θέρμανση(true/false);");
        userRequest = scanner.nextBoolean();

        openHeater = (temp < 18) || (humidity > 70 && userRequest);


        //Print the message
        System.out.println("Η θέρμανση ειναι ανοιχτη :" + openHeater);
    }

}
