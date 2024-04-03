// Importing the Scanner object.
import java.util.Scanner;

public class EveOddCnt {
    // Creating a new Scanner object.
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Declaring the variables.
        int countEve = 0; // -> Counter for the even numbers.
        int countOdd = 0; // -> Counter for the odd numbers.
        int num; // -> A whole number.

        // Asking for input until the number of odd and even numbers are equal.
        do {
            System.out.println("Please enter a whole number: ");
            num = sc.nextInt();

            // Checking if the number is even or odd and adding to the counter.
            if (num % 2 == 0) {
                countEve++;
            } else {
                countOdd++;
            }
        } while (countEve != countOdd);
    }
}
