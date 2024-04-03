// Importing Scanner.
import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        // Creating a new Scanner object.
        Scanner scanner = new Scanner(System.in);
        // Declaring the variable.
        int num; // A whole number.

        // Getting the input from the user: number.
        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        // Checking if the number is even or odd and printing a fitting messsage.
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is not even.");
        }
    }
}
