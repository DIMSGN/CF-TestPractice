package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει όλους τους ζυγούς αριθμούς από 1 έως 20
 */

public class PrintEven {
    public static void main(String[] args) {

        int step = 2;

        for (int i = 2; i <= 20; i = i + step)
            System.out.println(i);
    }
}
