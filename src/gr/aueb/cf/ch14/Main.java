package gr.aueb.cf.ch14;

public class Main extends MathHelper{

    public static void main(String[] args) {

        int[] arr = {-1, 32, 3, 4, 5};
        int maxNum = findMax(arr);
        int minNum = findMin(arr);
        int average = findAverage(arr);

        try {
            System.out.println("Max number in the array is: " + maxNum);
            System.out.println("Min number in the array is: " + minNum);
            System.out.println("Average: " + average);

        } catch (IllegalArgumentException e) {
            System.err.println("Error" + e.getMessage());
        }


    }
}
