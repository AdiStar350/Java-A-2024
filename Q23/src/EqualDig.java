// Importing the Scanner.
import java.util.Scanner;

public class EqualDig {
    // Creating a new Scanner object with "static" to use in the whole class.
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Declaring the variables;
        int num; // -> A number between 10 and 99.
        final int MIN = 10; // -> The minimum a number is allowed to be.
        final int MAX = 99; // -> The maximum a number is allowed to be.

        // Getting the input from the user.
        System.out.println("Please enter a number between 10 and 99: ");
        num = scanner.nextInt();

        // Checking if the input is valid.
        // Printing a fitting message.
        if ((num >= MIN) && (num <= MAX)) {
            // Checking if the two digits are equal.
            // Printing a fitting message.
            if (num % 11 == 0) {
                System.out.println("The two digits of the number are equal.");
            } else {
                System.out.println("The two digits of the number are not equal.");
            }
        } else {
            System.out.println("The number must be between 1 and 99!");
        }
    }
}
