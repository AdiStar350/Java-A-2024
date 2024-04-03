// Importing the Scanner.
import java.util.Scanner;

public class GetNums {
    // Creating a new Scanner object.
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Declaring the variables.
        int num = 1; // -> A whole number.
        int count; // -> The amount of numbers the user entered
        final int EXCLUDE = 0; // -> The number that makes the loop stop.

        // Getting the input from the user -> 10 numbers.
        System.out.println("Please enter 10 numbers, or 0 to end: ");
        
        for(count = 1; count <= 10 && num != EXCLUDE; count++) {
            System.out.print("-> ");
            num = scanner.nextInt();
        }

        // Calculating the amount of numbers.
        count -= 1;

        // Printing the amount of numbers that the user entered.
        System.out.println("The amount of numbers that you entered is " + count + ".");
    }
}