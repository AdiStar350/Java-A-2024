// Importing the Scanner.
import java.util.Scanner;

public class GreatestDig {
    // Creating a new Scanner object with "static", to use in the whole class.
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Declaring the variables.
        int num; // -> A whole number between 100 and 999.
        int dig1; // -> A digit of the number.
        int dig2; // -> A digit of the number.
        int dig3; // -> A digit of the number.
        int digMax; // -> A digit of the number with the highest value.
        final int LOW = 100; // -> The lowest value that the number can be. 
        final int HIGH = 999; // -> The highest value that the number can be.
        
        // Getting the input from the user -> A whole number between 100 and 999.
        System.out.println("Please enter a number between 100 and 999: ");
        num = scanner.nextInt();

        // Getting each digit from the number.
        dig1 = num / 100;
        dig2 = (num % 100) / 10;
        dig3 = num % 10;

        // Checking if the number is in range.
        // Printing a fitting message.
        if (num >= LOW && num <= HIGH) {
            // Checking which digit is the greatest.
            if (dig1 > dig2) {
                digMax = dig1;

                if (dig3 > dig1) {
                    digMax = dig3;
                }
            } else {
                digMax = dig2;

                if (dig3 > dig2){
                    digMax = dig3;
                }
            }

            // Printing the greatest digit.
            System.out.println("The greatest digit is " + digMax + ".");
        } else {
            System.out.println("The number is out of range! Please enter a number between 100 and 999!");
        }
    }
}
