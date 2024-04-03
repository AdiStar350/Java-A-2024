// Importing the Scanner.
import java.util.Scanner;

public class HowManyOdd {
    public static void main(String[] args) {
        // Creating a new Scanner object.
        Scanner scanner = new Scanner(System.in);
        // Declaring the variables.
        int num1; // -> A whole number.
        int num2; // -> A whole number.
        int num3; // -> A whole number.
        int odd = 0; // -> The amount of odd numbers.

        // Getting the input from the user -> A whole number.
        System.out.println("Please enter the first number: ");
        num1 = scanner.nextInt();

        // Getting the input from the user -> A whole number.
        System.out.println("Please enter the second number: ");
        num2 = scanner.nextInt();

        // Getting the input from the user -> A whole number.
        System.out.println("Please enter the third number: ");
        num3 = scanner.nextInt();

        // Counting if the first number is odd.
        if (num1 % 2 != 0) {
            odd++;
        }

        // Counting if the second number is odd.
        if (num2 % 2 != 0) {
            odd++;
        }

        // Counting if the third number is odd.
        if (num3 % 2 != 0) {
            odd++;
        }

        // Printing the amount of odd numbers.
        System.out.println("There are " + odd + " odd numbers.");
    }
}
