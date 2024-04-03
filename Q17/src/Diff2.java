// Importing the Scanner.
import java.util.Scanner;

public class Diff2 {
    public static void main(String[] args) {
        // Creating a new Scanner object.
        Scanner scanner = new Scanner(System.in);
        // Declaring the variables.
        int num1; // -> A whole number.
        int num2; // -> A whole number.
        int diff; // -> The difference between the two numbers.

        // Getting the input from the user -> A whole number.
        System.out.println("Please enter the first number: ");
        num1 = scanner.nextInt();

        // Getting the input from the user -> A whole number.
        System.out.println("Please enter the second number: ");
        num2 = scanner.nextInt();

        // Checking which number is bigger and calculating the difference.
        if (num1 > num2) {
            diff = num1 - num2;
        } else {
            diff = num2 - num1;
        }

        // Printing the difference to the user.
        System.out.println("The difference between the two numbers is " + diff + ".");
    }
}
