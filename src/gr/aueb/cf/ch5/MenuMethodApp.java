package gr.aueb.cf.ch5;
/**
 *  Εμφανίζει ένα μενού για την εμφάνιση διαφόρων μοτίβων αστεριών.
 *  Ο χρήστης μπορεί να επιλέξει από 6 επιλογές, συμπεριλαμβανομένων οριζόντιων, κάθετων,
 *  τετραγωνικών, αύξουσες και φθίνουσες σειρές αστεριών.
 */
import java.util.Scanner;

public class MenuMethodApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int n;

        while (true) {
            printMenu();
            choice = scanner.nextInt();

            if (choice == 6) {
                System.out.println("Επιλέξατε έξοδο...");
                System.out.println("Ευχαριστούμε.");
                return;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Μη έγκυρη επιλογή.");
                continue;
            }

            System.out.print("Παρακαλώ δώστε αριθμό για αστεράκια: ");
            n = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.printf("Επιλέξατε να εμφανιστούν %d αστεράκια οριζόντια.\n", n);
                    starsHorizontal(n);
                    System.out.println();
                }
                case 2 -> {
                    System.out.printf("Επιλέξατε να εμφανιστούν %d αστεράκια κάθετα.\n", n);
                }
                case 3 -> {
                    System.out.printf("Επιλέξατε να εμφανιστούν %d γραμμές με %d αστεράκια\n", n, n);
                    starsSquare(n);
                }
                case 4 -> {
                    System.out.printf("Επιλέξατε να εμφανιστούν %d γραμμές απο %d αστεράκια και να αυξάνονται κατά 1 σε κάθε γραμμή \n", n, n);
                    starsAsc(n);
                }
                case 5 -> {
                    System.out.printf("Επιλέξατε να εμφανιστούν %d γραμμές απο %d αστεράκια η μεγαλύτερη και να φθηναίνουν κατά 1 σε κάθε γραμμή \n", n, n);
                    starsDesc(n);
                }
                default -> {
                    return;

                }
            }
        }
    }

    /**
     * Εμφανίζει ενα μενού με επιλογές
     */
    public static void printMenu() {

        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.print("Δώσε επιλογή: ");

    }
    /**
     * Εμφανίζει οσα αστεράκια δώσει ο χρήστης, οριζόντια.
     * @param n ο αριθμός που δίνει ο χρήστης
     */
    public static void starsHorizontal(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print('*');
        }

    }
    /**
     * Εμφανίζει οσα αστεράκια δώσει ο χρήστης, κάθετα.
     * @param n ο αριθμός που δίνει ο χρήστης
     */
    public static void starsVertical(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println('*');
        }
    }
    /**
     * Εμφανίζει οσα αστεράκια δώσει ο χρήστης σε ισο αριθμό γραμμών
     * που θα δώσει ο χρήστης.
     * @param n ο αριθμός που δίνει ο χρήστης
     */
    public static void starsSquare(int n) {
        for(int i = 1; i <= n; i++) {
            starsHorizontal(n);
            System.out.println();
        }
    }

    /**
     * Εμφανίζει αστεράκια από 1 έως n σε κάθε γραμμή.
     * @param n Ο μέγιστος αριθμός αστεριών στην τελευταία γραμμή.
     */
    public static void starsAsc(int n) {
        for(int i = 1; i <= n; i++) {
            starsHorizontal(i);
            System.out.println();
        }
    }

    /**
     * Εμφανίζει αστεράκια από n έως 1 σε κάθε γραμμή.
     * @param n Ο μέγιστος αριθμός αστεριών στην πρώτη γραμμή.
     */
    public static void starsDesc(int n) {
        for(int i = n; i >= 1; i--) {
            starsHorizontal(i);
            System.out.println();
        }
    }
}
