package gr.aueb.cf.ch14;

/**
 *  Utility class με όνομα MathHelper με
 * public static μεθόδους για κοινές μαθηματικές λειτουργίες
 * όπως εύρεση του μέγιστου, ελάχιστου, και μέσου όρου ενός array από integers
 */

public class MathHelper {


    public static int findMax(int[] arr) {
        if (arr == null || arr.length < 1) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }


        int maxPosition = 0;
        int maxValue = arr[maxPosition];


        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static int findMin(int[] arr) {
        if (arr == null || arr.length < 1) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i =1; i <= arr.length - 1; i++){
            if(arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public static int findAverage(int[] arr) {
        if (arr == null || arr.length < 1) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum / arr.length;
    }


}
