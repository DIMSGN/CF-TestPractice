//package gr.aueb.cf.ch6;
//
//import java.util.Scanner;
//
///**
// * • Ζητήστε από τον χρήστη να εισάγει έξι ακεραίους από
// * 1 έως 49 και ελέγξτε αν αυτή η εξάδα περνάει από τα
// * παρακάτω φίλτρα (predicates)
// * 1. Δεν έχει πάνω από 3 άρτιους
// * 2. Δεν έχει πάνω από 3 περιττούς
// * 3. Δεν έχει πάνω από 3 συνεχόμενους
// * 4. Δεν έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα
// * 5. Δεν έχει πάνω από 3 αριθμούς στην ίδια δεκάδα
// */
//
//public class filterInput {
//    static final int NUM_COUNT = 6;
//    static final int MIN = 1;
//    static final int MAX = 49;
//    static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//        int[] inputNumbers;
//
//
//        System.out.println("Παρακαλώ εισάγετε έξι ακεραίους απο το 1 έως 49");
//        inputNumbers = new int[]{scanner.nextInt()};
//        if (!isInRange(inputNumbers)) {
//                System.out.println("Αριθμός εκτός ορίων! (1 - 49");
//
//        }
//
//        boolean filterEven = moreThanThreeEven(inputNumbers);
//        System.out.println("Οι παραπάνω ακέραιοι έχουν πάνω από 3 άρτιους: " + filterEven);
//
//    }
//
//    private static boolean isInRange(int[] num) {
//        for (int i = 0; i < num; i++) {
//            if (num < MIN || num > MAX) return false;
//        }
//        return true;
//
//        }
//
//    }
//
//    public static boolean moreThanThreeEven(int[] arr) {
//        int count = 0;
//        for (int num : arr)
//            if (num % 2 == 0)
//                count++;
//        return count > 3;
//
//    }
//
//    public static boolean moreThanThreeOdd(int[] arr) {
//        int count = 0;
//
//        for (int num : arr) {
//            if (num % 2 != 0)
//                count++;
//            if (count > 3)
//                return true;
//
//
//        }
//        return false;
//    }
//}
