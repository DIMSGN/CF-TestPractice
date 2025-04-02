package gr.aueb.cf.ch1;
/**
 * This program adds two numbers
 * and print the result in the console.
 */
public class AddNum {
    public static void main(String[] args) {

        //declaration
        int num1 = 19;
        int num2 = 30;
        int result = 0;

        //commands
        result = num1 + num2;

        //print in console
        System.out.printf("The total of adding %d and %d is %d\n", num1, num2, result);
        System.out.println("The total is " + result);
        System.out.println("The total of adding " + num1 +" and " + num2  + " is " + result);
    }
}
