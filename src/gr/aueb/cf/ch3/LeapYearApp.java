package gr.aueb.cf.ch3;

import java.util.Scanner;
/**
 * The user enters a year (e.g., 1995), and the program checks whether the year is a leap year.
 * Leap year rule :
 * 1. A year is divisible by 4 but not by 100, OR
 * 2. is divisible by 400
 * ((year % 4 == 0) AND (year % 100 != 0)) OR (year % 400 == 0)
 **/
public class LeapYearApp {
    public static void main(String[] args) {

        //declarations
        int year = 0;
        boolean isLeapYear = false;
        Scanner scanner = new Scanner(System.in);

        //user input and commands
        System.out.print("Please enter a year :");
        year = scanner.nextInt();
        isLeapYear = ( (year % 4 == 0) && (year % 100 != 0) ) || ( year % 400 == 0);

        //Print the expected result
        System.out.println("The year " + year + " is leap year : " + isLeapYear);
    }
}
