// Importing the Scanner object.
import java.util.Scanner;

public class Prime {
    // Creating a new Scanner object.
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Declaring the variables.
        int num; // -> A whole number.
        boolean isPrime = true; // -> Represents if a number is prime or not.

        // Getting the input from the user -> (num) => A whole number.
        System.out.println("Please enter a number: ");
        num = sc.nextInt();

        // Checking if the number is divisible by any of the numbers between 2 and the square root of the number.
        for (int i = (int) Math.sqrt(Math.abs(num)); i >= 2; i--) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Printing a fitting message.
        if (isPrime) {
            System.out.println(num + " is a prime number!");
        } else {
            System.out.println(num + " is not a prime number!");
        }
    }
}
