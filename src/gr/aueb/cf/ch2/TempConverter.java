package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 *  Παίρνει απο τον χρήστη τιμή σε fahrenheit(f) και την μετατρέπει σε celsius(c)
 *  χρησιμοποιόντας τον τύπο 5 * (f - 32) / 9;.
 */

public class TempConverter {
    public static void main(String[] args) {

       int f = 0;
       int c = 0;
       Scanner scanner = new Scanner(System.in);

        System.out.print("Εισάγετε τη θερμοκρασία σε Fahrenheit: ");
        f = scanner.nextInt();
        c = 5 * (f - 32) / 9;

        System.out.printf("%d βαθμους fahrenheit ειναι %d βαθμους celsius", f, c);
    }
}
