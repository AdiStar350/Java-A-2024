// Importing the Scanner.
import java.util.Scanner;

public class ThreeSameDig {
    // Creating a new Scanner object for the entire class using "static".
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Declaring the variables.
        int num; // -> A whole number between 100 and 999.
        final int LOW = 100; // -> The lowest a number is allowed to be.
        final int HIGH = 999; // -> The highest a number is allowed to be.

        // Getting the input from the user -> A whole number between 100 and 999.
        System.out.println("Please enter a number between 100 and 999: ");
        num = scanner.nextInt();

        // Checking if the number is in range or not.
        // Printing a fitting message.
        if (num > HIGH || num < LOW) {
            System.out.println("The number is out of range! Please enter a number between 100 and 999!");
        } else {
            // Checking if the number consists of the same digits.
            if (num % 111 == 0) {
                System.out.println("All digits are the same!");
            } else {
                System.out.println("The digits are different!");
            }
        }
    }
}
