// Importing the Scanner.
import java.util.Scanner;

public class SumOf10 {
    // Creating a new Scanner object with "static" to use in the whole class.
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Declaring the variables.
        int sum = 0; // -> The sum of the numbers the user entered.

        // Getting the input from the user 10 times -> A number.
        System.out.println("Please enter 10 numbers: ");

        for(int i = 1; i <= 10; i++) {
            System.out.print(i + ". ");
            sum += scanner.nextInt();
        }

        // Printing the sum of the numbers.
        System.out.println("The sum of the numbers is: " + sum + ".");
    }
}
