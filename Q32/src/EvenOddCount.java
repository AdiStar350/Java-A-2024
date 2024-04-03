// Importing the Scanner.
import java.util.Scanner;

public class EvenOddCount {
    // Creating a new Scanner object.
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Declaring the variables.
        int num; // -> A whole number.
        int countEve = 0; // -> The amount of even numbers.
        int countOdd = 0; // -> The amount of odd numbers.

        // Getting the input from the user -> 10 numbers.
        System.out.println("Please enter 10 numbers: ");

        for(int i = 1; i <= 10; i++) {
            System.out.print(i + ". ");
            num = scanner.nextInt();

            if(num % 2 == 0) {
                countEve++;
            } else {
                countOdd++;
            }
        }
        
        // Printing the amount of odd numbers and even numbers.
        System.out.println("There are " + countOdd + " odd numbers.");
        System.out.println("There are " + countEve + " even numbers.");
    }
}

