// Importing the Scanner.
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        // Creating a new Scanner object.
        Scanner scanner = new Scanner(System.in);
        // Declaring the variables.
        int num1; // -> A whole number.
        int num2; // -> A whole number.

        // Getting the input from the user -> A whole number.
        System.out.println("Please enter the first number: ");
        num1 = scanner.nextInt();

        // Getting the input from the user -> A whole number.
        System.out.println("Please enter the second number: ");
        num2 = scanner.nextInt();

        // Checking if the numbers are even or odd.
        // Printing a matching message.
        if ((num1 % 2 == 0) && (num2 % 2 == 0)) {
            System.out.println("Both numbers are even.");
        } else if ((num1 % 2 == 0) && (num2 % 2 != 0)) {
            System.out.println("Only the first number is even.");
        } else if ((num1 % 2 != 0) && (num2 % 2 == 0)) {
            System.out.println("Only the second number is even.");
        } else {
            System.out.println("Both numbers are odd.");
        }
    }
}
