// Importing the Scanner.
import java.util.Scanner;

public class AvgLoop {
    // Creating a new Scanner object.
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Declaring the variables.
        int sum = 0; // -> The sum of the numbers.
        float avg; // -> The average of the numbers.

        // Getting the input from the user -> 7 numbers.
        System.out.println("Please enter 7 numbers: ");

        for(int i = 1; i <= 7; i++) {
            System.out.print(i + ". ");
            sum += scanner.nextInt();
        }

        // Calculating the average of the numbers.
        avg = sum / 7f;
        // Printing the average of the numbers.
        System.out.println("The average is " + String.format("%.2f", avg) + ".");
    }
}
