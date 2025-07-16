package gr.aueb.cf.ch6;
/**
 * Δύο βάτραχοι προσπαθούν να πιάσουν μία αράχνη.
 * Γράψτε μία μέθοδο που παίρνει ως είσοδο τρεις ακεραίους
 * που αντιπροσωπεύουν τη θέση του κάθε βατράχου καθώς και
 * τη θέση της αράχνης.

 * Η διαφορά μεταξύ των θέσεων δίνει την απόσταση μεταξύ
 * του κάθε βατράχου και της αράχνης.

 * Αν ο 1ος βάτραχος πιάσει την αράχνη, τότε εκτυπώστε μήνυμα «Βάτραχος 1»,
 * αν ο 2ος βάτραχος πιάσει την αράχνη, τότε εκτυπώστε μήνυμα του «Βάτραχος 2»,
 * αν και οι δύο βάτραχοι φτάσουν την ίδια στιγμή εκτυπώστε «Αράχνη».
 * Για παράδειγμα, αν το input είναι
 * 2 3 4 τότε εκτυπώνει «Βάτραχος 2».
 * Αν είναι 5 7 6 τότε εκτυπώνει «Αράχνη».
 * Σας δίνεται ένας δισδιάστατος πίνακας όπου η κάθε γραμμή είναι 3 αριθμοί
 * όπως παραπάνω και θα πρέπει να εκτυπώσετε μία απάντηση για κάθε περίπτωση.
 */

public class TwoFrogsOneSpider {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 7, 9},
                {1, 2, 4},
                {1, 4, -2},
                {5, 7, 6}
        };

        for (int[] ints : arr) {
            frogGame(ints[0], ints[1], ints[2]);
        }
    }

    public static void frogGame(int frogA, int frogB, int spider) {
        int difCheckA;
        int difCheckB;

        difCheckB = Math.abs(spider - frogB);
        difCheckA = Math.abs(spider - frogA);

        if (difCheckB < difCheckA) {
            System.out.println("Βάτραχος 2");

        } else if (difCheckA < difCheckB) {
            System.out.println("Βάτραχος 1");

        } else {
            System.out.println("Αράχνη");
        }

    }
}
