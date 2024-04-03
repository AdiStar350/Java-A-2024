// Importing the scanner.
import java.util.Scanner;

public class Guess {
    // Creating a new Scanner object.
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Declaring the variables.
        int num; // -> A number between 1 and 100.
        int guess; // -> The number that the user guesses.

        // Getting the random number.
        num = (int) (Math.random() * 100) + 1;

        for (int i = 0; i < 1; i++) {
            //Getting the input from the user -> The number that the user guesses.
            System.out.println("Guess the number between 1 and 100: ");
            guess = scanner.nextInt();

            // Hinting the user.
            if (guess < num) {
                System.out.println("Too low!\n");
                i--;
            } else if (guess > num) {
                System.out.println("Too high!\n");
                i--;
            } 
        }
        // Printing to the user when he guessed right.
        System.out.println("Success!\n");
    }
}
