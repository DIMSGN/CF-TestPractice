package gr.aueb.cf.ch4;

/**
 * Φτιάχνει μία πυραμίδα από * με 4 σειρές
 */

public class StarPyramid {
    public static void main(String[] args) {
        char star = '*';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%c", star);
            }
            System.out.println();
        }
    }
}
