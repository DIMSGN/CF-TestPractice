package gr.aueb.cf.ch4;
/**
 * For loop runs until 100 with a new line every 10 lines, idiomatic case.
 */
public class Until100App {
    public static void main(String[] args) {
        int count = 1;
        String partyCode = new String(Character.toChars(0x1F389));

        for (;;) {
            System.out.printf("%3d. Run until 100\n", count);
            count++;

            // New line every 10 numbers
            if ((count - 1) % 10 == 0) System.out.println();

            // Celebrate at 100 🎉
            if (count == 100) {
                System.out.printf("%d. %s Congrats you reached 100 %s",count, partyCode, partyCode);
            }

            // Stop after 100
            if (count > 99) break;
        }
    }
}