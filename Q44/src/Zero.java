// Importing the Scanner.
import java.util.Scanner;

public class Zero {
    // Creating a new Scanner object.
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Declaring the variables.
        int num; // -> The input number from the user.
        int count = 0; // -> The sum of all the numbers entered.

        // Asking for input until it's zero.
        do {
            System.out.println("Please enter a number, or zero to stop: ");
            num = sc.nextInt();
            count += num;
        } while (num != 0);

        // Printing the sum of the entered numbers.
        System.out.println("Total: " + count);
    }
}
